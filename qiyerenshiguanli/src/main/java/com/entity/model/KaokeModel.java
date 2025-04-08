package com.entity.model;

import com.entity.KaokeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 考核
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KaokeModel implements Serializable {
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
     * 考核名称
     */
    private String kaokeName;


    /**
     * 考核类型
     */
    private Integer kaokeTypes;


    /**
     * 考核详情
     */
    private String kaokeContent;


    /**
     * 是否通过
     */
    private Integer kaokeYesnoTypes;


    /**
     * 添加时间
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
	 * 获取：考核名称
	 */
    public String getKaokeName() {
        return kaokeName;
    }


    /**
	 * 设置：考核名称
	 */
    public void setKaokeName(String kaokeName) {
        this.kaokeName = kaokeName;
    }
    /**
	 * 获取：考核类型
	 */
    public Integer getKaokeTypes() {
        return kaokeTypes;
    }


    /**
	 * 设置：考核类型
	 */
    public void setKaokeTypes(Integer kaokeTypes) {
        this.kaokeTypes = kaokeTypes;
    }
    /**
	 * 获取：考核详情
	 */
    public String getKaokeContent() {
        return kaokeContent;
    }


    /**
	 * 设置：考核详情
	 */
    public void setKaokeContent(String kaokeContent) {
        this.kaokeContent = kaokeContent;
    }
    /**
	 * 获取：是否通过
	 */
    public Integer getKaokeYesnoTypes() {
        return kaokeYesnoTypes;
    }


    /**
	 * 设置：是否通过
	 */
    public void setKaokeYesnoTypes(Integer kaokeYesnoTypes) {
        this.kaokeYesnoTypes = kaokeYesnoTypes;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
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
