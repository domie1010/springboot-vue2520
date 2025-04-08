package com.entity.model;

import com.entity.JinagchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 奖惩
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JinagchengModel implements Serializable {
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
     * 奖惩名称
     */
    private String jinagchengName;


    /**
     * 奖惩类型
     */
    private Integer jinagchengTypes;


    /**
     * 奖惩详情
     */
    private String jinagchengContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：奖惩名称
	 */
    public String getJinagchengName() {
        return jinagchengName;
    }


    /**
	 * 设置：奖惩名称
	 */
    public void setJinagchengName(String jinagchengName) {
        this.jinagchengName = jinagchengName;
    }
    /**
	 * 获取：奖惩类型
	 */
    public Integer getJinagchengTypes() {
        return jinagchengTypes;
    }


    /**
	 * 设置：奖惩类型
	 */
    public void setJinagchengTypes(Integer jinagchengTypes) {
        this.jinagchengTypes = jinagchengTypes;
    }
    /**
	 * 获取：奖惩详情
	 */
    public String getJinagchengContent() {
        return jinagchengContent;
    }


    /**
	 * 设置：奖惩详情
	 */
    public void setJinagchengContent(String jinagchengContent) {
        this.jinagchengContent = jinagchengContent;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
