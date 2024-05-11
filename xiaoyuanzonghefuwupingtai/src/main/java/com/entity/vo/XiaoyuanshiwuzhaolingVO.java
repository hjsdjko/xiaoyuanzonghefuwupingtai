package com.entity.vo;

import com.entity.XiaoyuanshiwuzhaolingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 失物招领
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xiaoyuanshiwuzhaoling")
public class XiaoyuanshiwuzhaolingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 失物编号
     */

    @TableField(value = "xiaoyuanshiwuzhaoling_uuid_number")
    private String xiaoyuanshiwuzhaolingUuidNumber;


    /**
     * 物品名称
     */

    @TableField(value = "xiaoyuanshiwuzhaoling_name")
    private String xiaoyuanshiwuzhaolingName;


    /**
     * 物品类型
     */

    @TableField(value = "shiwuzhaoling_types")
    private Integer shiwuzhaolingTypes;


    /**
     * 物品状态
     */

    @TableField(value = "status_types")
    private Integer statusTypes;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 物品图片
     */

    @TableField(value = "xiaoyuanshiwuzhaoling_photo")
    private String xiaoyuanshiwuzhaolingPhoto;


    /**
     * 拾遗时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "xiaoyuanshiwuzhaoling_time")
    private Date xiaoyuanshiwuzhaolingTime;


    /**
     * 拾遗地址
     */

    @TableField(value = "xiaoyuanshiwuzhaoling_dizhi")
    private String xiaoyuanshiwuzhaolingDizhi;


    /**
     * 详情
     */

    @TableField(value = "xiaoyuanshiwuzhaoling_content")
    private String xiaoyuanshiwuzhaolingContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：失物编号
	 */
    public String getXiaoyuanshiwuzhaolingUuidNumber() {
        return xiaoyuanshiwuzhaolingUuidNumber;
    }


    /**
	 * 获取：失物编号
	 */

    public void setXiaoyuanshiwuzhaolingUuidNumber(String xiaoyuanshiwuzhaolingUuidNumber) {
        this.xiaoyuanshiwuzhaolingUuidNumber = xiaoyuanshiwuzhaolingUuidNumber;
    }
    /**
	 * 设置：物品名称
	 */
    public String getXiaoyuanshiwuzhaolingName() {
        return xiaoyuanshiwuzhaolingName;
    }


    /**
	 * 获取：物品名称
	 */

    public void setXiaoyuanshiwuzhaolingName(String xiaoyuanshiwuzhaolingName) {
        this.xiaoyuanshiwuzhaolingName = xiaoyuanshiwuzhaolingName;
    }
    /**
	 * 设置：物品类型
	 */
    public Integer getShiwuzhaolingTypes() {
        return shiwuzhaolingTypes;
    }


    /**
	 * 获取：物品类型
	 */

    public void setShiwuzhaolingTypes(Integer shiwuzhaolingTypes) {
        this.shiwuzhaolingTypes = shiwuzhaolingTypes;
    }
    /**
	 * 设置：物品状态
	 */
    public Integer getStatusTypes() {
        return statusTypes;
    }


    /**
	 * 获取：物品状态
	 */

    public void setStatusTypes(Integer statusTypes) {
        this.statusTypes = statusTypes;
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
	 * 设置：物品图片
	 */
    public String getXiaoyuanshiwuzhaolingPhoto() {
        return xiaoyuanshiwuzhaolingPhoto;
    }


    /**
	 * 获取：物品图片
	 */

    public void setXiaoyuanshiwuzhaolingPhoto(String xiaoyuanshiwuzhaolingPhoto) {
        this.xiaoyuanshiwuzhaolingPhoto = xiaoyuanshiwuzhaolingPhoto;
    }
    /**
	 * 设置：拾遗时间
	 */
    public Date getXiaoyuanshiwuzhaolingTime() {
        return xiaoyuanshiwuzhaolingTime;
    }


    /**
	 * 获取：拾遗时间
	 */

    public void setXiaoyuanshiwuzhaolingTime(Date xiaoyuanshiwuzhaolingTime) {
        this.xiaoyuanshiwuzhaolingTime = xiaoyuanshiwuzhaolingTime;
    }
    /**
	 * 设置：拾遗地址
	 */
    public String getXiaoyuanshiwuzhaolingDizhi() {
        return xiaoyuanshiwuzhaolingDizhi;
    }


    /**
	 * 获取：拾遗地址
	 */

    public void setXiaoyuanshiwuzhaolingDizhi(String xiaoyuanshiwuzhaolingDizhi) {
        this.xiaoyuanshiwuzhaolingDizhi = xiaoyuanshiwuzhaolingDizhi;
    }
    /**
	 * 设置：详情
	 */
    public String getXiaoyuanshiwuzhaolingContent() {
        return xiaoyuanshiwuzhaolingContent;
    }


    /**
	 * 获取：详情
	 */

    public void setXiaoyuanshiwuzhaolingContent(String xiaoyuanshiwuzhaolingContent) {
        this.xiaoyuanshiwuzhaolingContent = xiaoyuanshiwuzhaolingContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
