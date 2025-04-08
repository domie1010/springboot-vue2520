package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.GongziEntity;

import com.service.GongziService;
import com.entity.view.GongziView;
import com.service.YonghuService;
import com.entity.YonghuEntity;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 薪资
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/gongzi")
public class GongziController {
    private static final Logger logger = LoggerFactory.getLogger(GongziController.class);

    @Autowired
    private GongziService gongziService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("员工".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        params.put("orderBy","id");
        PageUtils page = gongziService.queryPage(params);

        //字典表数据转换
        List<GongziView> list =(List<GongziView>)page.getList();
        for(GongziView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        GongziEntity gongzi = gongziService.selectById(id);
        if(gongzi !=null){
            //entity转view
            GongziView view = new GongziView();
            BeanUtils.copyProperties( gongzi , view );//把实体数据重构到view中

            //级联表
            YonghuEntity yonghu = yonghuService.selectById(gongzi.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody GongziEntity gongzi, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,gongzi:{}",this.getClass().getName(),gongzi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("员工".equals(role))
            gongzi.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        Wrapper<GongziEntity> queryWrapper = new EntityWrapper<GongziEntity>()
            .eq("yonghu_id", gongzi.getYonghuId())
            .eq("month_time", gongzi.getMonthTime())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GongziEntity gongziEntity = gongziService.selectOne(queryWrapper);
        if(gongziEntity==null){
            gongzi.setZongMoney(gongzi.getJibenMoney()+gongzi.getJixiaoMoney()+gongzi.getButieMoney());
            gongzi.setCreateTime(new Date());
            gongziService.insert(gongzi);
            return R.ok();
        }else {
            return R.error(511,"该员工该月份已有工资");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody GongziEntity gongzi, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,gongzi:{}",this.getClass().getName(),gongzi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("员工".equals(role))
            gongzi.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<GongziEntity> queryWrapper = new EntityWrapper<GongziEntity>()
            .notIn("id",gongzi.getId())
            .andNew()
            .eq("yonghu_id", gongzi.getYonghuId())
            .eq("month_time", gongzi.getMonthTime())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GongziEntity gongziEntity = gongziService.selectOne(queryWrapper);
        if(gongziEntity==null){

            gongzi.setZongMoney(gongzi.getJibenMoney()+gongzi.getJixiaoMoney()+gongzi.getButieMoney());
            gongziService.updateById(gongzi);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"该员工该月份已有工资");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        gongziService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }






}

