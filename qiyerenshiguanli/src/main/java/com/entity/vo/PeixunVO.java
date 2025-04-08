package com.entity.vo;

import com.entity.PeixunEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 培训
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("peixun")
public class PeixunVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 培训名称
     */

    @TableField(value = "peixun_name")
    private String peixunName;


    /**
     * 培训类型
     */

    @TableField(value = "peixun_types")
    private Integer peixunTypes;


    /**
     * 培训开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "on_time")
    private Date onTime;


    /**
     * 培训结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "down_time")
    private Date downTime;


    /**
     * 培训内容
     */

    @TableField(value = "peixun_content")
    private String peixunContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：培训名称
	 */
    public String getPeixunName() {
        return peixunName;
    }


    /**
	 * 获取：培训名称
	 */

    public void setPeixunName(String peixunName) {
        this.peixunName = peixunName;
    }
    /**
	 * 设置：培训类型
	 */
    public Integer getPeixunTypes() {
        return peixunTypes;
    }


    /**
	 * 获取：培训类型
	 */

    public void setPeixunTypes(Integer peixunTypes) {
        this.peixunTypes = peixunTypes;
    }
    /**
	 * 设置：培训开始时间
	 */
    public Date getOnTime() {
        return onTime;
    }


    /**
	 * 获取：培训开始时间
	 */

    public void setOnTime(Date onTime) {
        this.onTime = onTime;
    }
    /**
	 * 设置：培训结束时间
	 */
    public Date getDownTime() {
        return downTime;
    }


    /**
	 * 获取：培训结束时间
	 */

    public void setDownTime(Date downTime) {
        this.downTime = downTime;
    }
    /**
	 * 设置：培训内容
	 */
    public String getPeixunContent() {
        return peixunContent;
    }


    /**
	 * 获取：培训内容
	 */

    public void setPeixunContent(String peixunContent) {
        this.peixunContent = peixunContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
