package com.entity.model;

import com.entity.XiaoyuanshiwuzhaolingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 失物招领
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiaoyuanshiwuzhaolingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 失物编号
     */
    private String xiaoyuanshiwuzhaolingUuidNumber;


    /**
     * 物品名称
     */
    private String xiaoyuanshiwuzhaolingName;


    /**
     * 物品类型
     */
    private Integer shiwuzhaolingTypes;


    /**
     * 物品状态
     */
    private Integer statusTypes;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 物品图片
     */
    private String xiaoyuanshiwuzhaolingPhoto;


    /**
     * 拾遗时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date xiaoyuanshiwuzhaolingTime;


    /**
     * 拾遗地址
     */
    private String xiaoyuanshiwuzhaolingDizhi;


    /**
     * 详情
     */
    private String xiaoyuanshiwuzhaolingContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：失物编号
	 */
    public String getXiaoyuanshiwuzhaolingUuidNumber() {
        return xiaoyuanshiwuzhaolingUuidNumber;
    }


    /**
	 * 设置：失物编号
	 */
    public void setXiaoyuanshiwuzhaolingUuidNumber(String xiaoyuanshiwuzhaolingUuidNumber) {
        this.xiaoyuanshiwuzhaolingUuidNumber = xiaoyuanshiwuzhaolingUuidNumber;
    }
    /**
	 * 获取：物品名称
	 */
    public String getXiaoyuanshiwuzhaolingName() {
        return xiaoyuanshiwuzhaolingName;
    }


    /**
	 * 设置：物品名称
	 */
    public void setXiaoyuanshiwuzhaolingName(String xiaoyuanshiwuzhaolingName) {
        this.xiaoyuanshiwuzhaolingName = xiaoyuanshiwuzhaolingName;
    }
    /**
	 * 获取：物品类型
	 */
    public Integer getShiwuzhaolingTypes() {
        return shiwuzhaolingTypes;
    }


    /**
	 * 设置：物品类型
	 */
    public void setShiwuzhaolingTypes(Integer shiwuzhaolingTypes) {
        this.shiwuzhaolingTypes = shiwuzhaolingTypes;
    }
    /**
	 * 获取：物品状态
	 */
    public Integer getStatusTypes() {
        return statusTypes;
    }


    /**
	 * 设置：物品状态
	 */
    public void setStatusTypes(Integer statusTypes) {
        this.statusTypes = statusTypes;
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
	 * 获取：物品图片
	 */
    public String getXiaoyuanshiwuzhaolingPhoto() {
        return xiaoyuanshiwuzhaolingPhoto;
    }


    /**
	 * 设置：物品图片
	 */
    public void setXiaoyuanshiwuzhaolingPhoto(String xiaoyuanshiwuzhaolingPhoto) {
        this.xiaoyuanshiwuzhaolingPhoto = xiaoyuanshiwuzhaolingPhoto;
    }
    /**
	 * 获取：拾遗时间
	 */
    public Date getXiaoyuanshiwuzhaolingTime() {
        return xiaoyuanshiwuzhaolingTime;
    }


    /**
	 * 设置：拾遗时间
	 */
    public void setXiaoyuanshiwuzhaolingTime(Date xiaoyuanshiwuzhaolingTime) {
        this.xiaoyuanshiwuzhaolingTime = xiaoyuanshiwuzhaolingTime;
    }
    /**
	 * 获取：拾遗地址
	 */
    public String getXiaoyuanshiwuzhaolingDizhi() {
        return xiaoyuanshiwuzhaolingDizhi;
    }


    /**
	 * 设置：拾遗地址
	 */
    public void setXiaoyuanshiwuzhaolingDizhi(String xiaoyuanshiwuzhaolingDizhi) {
        this.xiaoyuanshiwuzhaolingDizhi = xiaoyuanshiwuzhaolingDizhi;
    }
    /**
	 * 获取：详情
	 */
    public String getXiaoyuanshiwuzhaolingContent() {
        return xiaoyuanshiwuzhaolingContent;
    }


    /**
	 * 设置：详情
	 */
    public void setXiaoyuanshiwuzhaolingContent(String xiaoyuanshiwuzhaolingContent) {
        this.xiaoyuanshiwuzhaolingContent = xiaoyuanshiwuzhaolingContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
