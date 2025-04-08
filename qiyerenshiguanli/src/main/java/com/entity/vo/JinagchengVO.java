package com.entity.vo;

import com.entity.JinagchengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 奖惩
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jinagcheng")
public class JinagchengVO implements Serializable {
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

    @TableField(value = "insert_time")
    private Date insertTime;


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

}
