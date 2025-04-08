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
 * 薪资
 *
 * @author 
 * @email
 */
@TableName("gongzi")
public class GongziEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GongziEntity() {

	}

	public GongziEntity(T t) {
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
     * 月份
     */
    @TableField(value = "month_time",fill = FieldFill.UPDATE)

    private String monthTime;


    /**
     * 基本工资
     */
    @TableField(value = "jiben_money")

    private Double jibenMoney;


    /**
     * 绩效工资
     */
    @TableField(value = "jixiao_money")

    private Double jixiaoMoney;


    /**
     * 餐饮补贴
     */
    @TableField(value = "butie_money")

    private Double butieMoney;


    /**
     * 备注
     */
    @TableField(value = "gongzi_content")

    private String gongziContent;


    /**
     * 总计工资
     */
    @TableField(value = "zong_money")

    private Double zongMoney;


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
	 * 设置：月份
	 */
    public String getMonthTime() {
        return monthTime;
    }


    /**
	 * 获取：月份
	 */

    public void setMonthTime(String monthTime) {
        this.monthTime = monthTime;
    }
    /**
	 * 设置：基本工资
	 */
    public Double getJibenMoney() {
        return jibenMoney;
    }


    /**
	 * 获取：基本工资
	 */

    public void setJibenMoney(Double jibenMoney) {
        this.jibenMoney = jibenMoney;
    }
    /**
	 * 设置：绩效工资
	 */
    public Double getJixiaoMoney() {
        return jixiaoMoney;
    }


    /**
	 * 获取：绩效工资
	 */

    public void setJixiaoMoney(Double jixiaoMoney) {
        this.jixiaoMoney = jixiaoMoney;
    }
    /**
	 * 设置：餐饮补贴
	 */
    public Double getButieMoney() {
        return butieMoney;
    }


    /**
	 * 获取：餐饮补贴
	 */

    public void setButieMoney(Double butieMoney) {
        this.butieMoney = butieMoney;
    }
    /**
	 * 设置：备注
	 */
    public String getGongziContent() {
        return gongziContent;
    }


    /**
	 * 获取：备注
	 */

    public void setGongziContent(String gongziContent) {
        this.gongziContent = gongziContent;
    }
    /**
	 * 设置：总计工资
	 */
    public Double getZongMoney() {
        return zongMoney;
    }


    /**
	 * 获取：总计工资
	 */

    public void setZongMoney(Double zongMoney) {
        this.zongMoney = zongMoney;
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
        return "Gongzi{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", monthTime=" + monthTime +
            ", jibenMoney=" + jibenMoney +
            ", jixiaoMoney=" + jixiaoMoney +
            ", butieMoney=" + butieMoney +
            ", gongziContent=" + gongziContent +
            ", zongMoney=" + zongMoney +
            ", createTime=" + createTime +
        "}";
    }
}
