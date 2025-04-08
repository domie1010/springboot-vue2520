package com.dao;

import com.entity.JinagchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JinagchengView;

/**
 * 奖惩 Dao 接口
 *
 * @author 
 */
public interface JinagchengDao extends BaseMapper<JinagchengEntity> {

   List<JinagchengView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
