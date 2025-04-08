package com.entity.model;

import com.entity.GongziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 薪资
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GongziModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 月份
     */
    private String monthTime;


    /**
     * 基本工资
     */
    private Double jibenMoney;


    /**
     * 绩效工资
     */
    private Double jixiaoMoney;


    /**
     * 餐饮补贴
     */
    private Double butieMoney;


    /**
     * 备注
     */
    private String gongziContent;


    /**
     * 总计工资
     */
    private Double zongMoney;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：月份
	 */
    public String getMonthTime() {
        return monthTime;
    }


    /**
	 * 设置：月份
	 */
    public void setMonthTime(String monthTime) {
        this.monthTime = monthTime;
    }
    /**
	 * 获取：基本工资
	 */
    public Double getJibenMoney() {
        return jibenMoney;
    }


    /**
	 * 设置：基本工资
	 */
    public void setJibenMoney(Double jibenMoney) {
        this.jibenMoney = jibenMoney;
    }
    /**
	 * 获取：绩效工资
	 */
    public Double getJixiaoMoney() {
        return jixiaoMoney;
    }


    /**
	 * 设置：绩效工资
	 */
    public void setJixiaoMoney(Double jixiaoMoney) {
        this.jixiaoMoney = jixiaoMoney;
    }
    /**
	 * 获取：餐饮补贴
	 */
    public Double getButieMoney() {
        return butieMoney;
    }


    /**
	 * 设置：餐饮补贴
	 */
    public void setButieMoney(Double butieMoney) {
        this.butieMoney = butieMoney;
    }
    /**
	 * 获取：备注
	 */
    public String getGongziContent() {
        return gongziContent;
    }


    /**
	 * 设置：备注
	 */
    public void setGongziContent(String gongziContent) {
        this.gongziContent = gongziContent;
    }
    /**
	 * 获取：总计工资
	 */
    public Double getZongMoney() {
        return zongMoney;
    }


    /**
	 * 设置：总计工资
	 */
    public void setZongMoney(Double zongMoney) {
        this.zongMoney = zongMoney;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
