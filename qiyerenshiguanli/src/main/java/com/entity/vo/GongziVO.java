package com.entity.vo;

import com.entity.GongziEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 薪资
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gongzi")
public class GongziVO implements Serializable {
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
     * 月份
     */

    @TableField(value = "month_time")
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

}
