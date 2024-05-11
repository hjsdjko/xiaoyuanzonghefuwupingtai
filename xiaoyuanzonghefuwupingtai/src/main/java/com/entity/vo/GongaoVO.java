package com.entity.vo;

import com.entity.GongaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 校园资讯
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gongao")
public class GongaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 资讯详情
     */

    @TableField(value = "gongao_content")
    private String gongaoContent;


    /**
     * 创建时间 show1 show2 nameShow
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
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
