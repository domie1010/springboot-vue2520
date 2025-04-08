package com.entity.vo;

import com.entity.KaokeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 考核
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kaoke")
public class KaokeVO implements Serializable {
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
     * 考核名称
     */

    @TableField(value = "kaoke_name")
    private String kaokeName;


    /**
     * 考核类型
     */

    @TableField(value = "kaoke_types")
    private Integer kaokeTypes;


    /**
     * 考核详情
     */

    @TableField(value = "kaoke_content")
    private String kaokeContent;


    /**
     * 是否通过
     */

    @TableField(value = "kaoke_yesno_types")
    private Integer kaokeYesnoTypes;


    /**
     * 添加时间
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
	 * 设置：考核名称
	 */
    public String getKaokeName() {
        return kaokeName;
    }


    /**
	 * 获取：考核名称
	 */

    public void setKaokeName(String kaokeName) {
        this.kaokeName = kaokeName;
    }
    /**
	 * 设置：考核类型
	 */
    public Integer getKaokeTypes() {
        return kaokeTypes;
    }


    /**
	 * 获取：考核类型
	 */

    public void setKaokeTypes(Integer kaokeTypes) {
        this.kaokeTypes = kaokeTypes;
    }
    /**
	 * 设置：考核详情
	 */
    public String getKaokeContent() {
        return kaokeContent;
    }


    /**
	 * 获取：考核详情
	 */

    public void setKaokeContent(String kaokeContent) {
        this.kaokeContent = kaokeContent;
    }
    /**
	 * 设置：是否通过
	 */
    public Integer getKaokeYesnoTypes() {
        return kaokeYesnoTypes;
    }


    /**
	 * 获取：是否通过
	 */

    public void setKaokeYesnoTypes(Integer kaokeYesnoTypes) {
        this.kaokeYesnoTypes = kaokeYesnoTypes;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
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
