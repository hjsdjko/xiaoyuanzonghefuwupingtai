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
 * 校园资讯
 *
 * @author 
 * @email
 */
@TableName("gongao")
public class GongaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GongaoEntity() {

	}

	public GongaoEntity(T t) {
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
     * 资讯标题
     */
    @TableField(value = "gongao_name")

    private String gongaoName;


    /**
     * 资讯类型
     */
    @TableField(value = "gongao_types")

    private Integer gongaoTypes;


    /**
     * 资讯图片
     */
    @TableField(value = "gongao_photo")

    private String gongaoPhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 资讯详情
     */
    @TableField(value = "gongao_content")

    private String gongaoContent;


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
	 * 设置：资讯标题
	 */
    public String getGongaoName() {
        return gongaoName;
    }
    /**
	 * 获取：资讯标题
	 */

    public void setGongaoName(String gongaoName) {
        this.gongaoName = gongaoName;
    }
    /**
	 * 设置：资讯类型
	 */
    public Integer getGongaoTypes() {
        return gongaoTypes;
    }
    /**
	 * 获取：资讯类型
	 */

    public void setGongaoTypes(Integer gongaoTypes) {
        this.gongaoTypes = gongaoTypes;
    }
    /**
	 * 设置：资讯图片
	 */
    public String getGongaoPhoto() {
        return gongaoPhoto;
    }
    /**
	 * 获取：资讯图片
	 */

    public void setGongaoPhoto(String gongaoPhoto) {
        this.gongaoPhoto = gongaoPhoto;
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
	 * 设置：资讯详情
	 */
    public String getGongaoContent() {
        return gongaoContent;
    }
    /**
	 * 获取：资讯详情
	 */

    public void setGongaoContent(String gongaoContent) {
        this.gongaoContent = gongaoContent;
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
        return "Gongao{" +
            "id=" + id +
            ", gongaoName=" + gongaoName +
            ", gongaoTypes=" + gongaoTypes +
            ", gongaoPhoto=" + gongaoPhoto +
            ", insertTime=" + insertTime +
            ", gongaoContent=" + gongaoContent +
            ", createTime=" + createTime +
        "}";
    }
}
