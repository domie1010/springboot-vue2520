package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 奖惩
 *
 * @author 
 * @email
 */
@TableName("jinagcheng")
public class JinagchengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JinagchengEntity() {

	}

	public JinagchengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 奖惩名称
     */
    @TableField(value = "jinagcheng_name")

    private String jinagchengName;


    /**
     * 奖惩类型
     */
    @TableField(value = "jinagcheng_types")

    private Integer jinagchengTypes;


    /**
     * 奖惩详情
     */
    @TableField(value = "jinagcheng_content")

    private String jinagchengContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：奖惩名称
	 */
    public String getJinagchengName() {
        return jinagchengName;
    }


    /**
	 * 获取：奖惩名称
	 */

    public void setJinagchengName(String jinagchengName) {
        this.jinagchengName = jinagchengName;
    }
    /**
	 * 设置：奖惩类型
	 */
    public Integer getJinagchengTypes() {
        return jinagchengTypes;
    }


    /**
	 * 获取：奖惩类型
	 */

    public void setJinagchengTypes(Integer jinagchengTypes) {
        this.jinagchengTypes = jinagchengTypes;
    }
    /**
	 * 设置：奖惩详情
	 */
    public String getJinagchengContent() {
        return jinagchengContent;
    }


    /**
	 * 获取：奖惩详情
	 */

    public void setJinagchengContent(String jinagchengContent) {
        this.jinagchengContent = jinagchengContent;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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

    @Override
    public String toString() {
        return "Jinagcheng{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", jinagchengName=" + jinagchengName +
            ", jinagchengTypes=" + jinagchengTypes +
            ", jinagchengContent=" + jinagchengContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
