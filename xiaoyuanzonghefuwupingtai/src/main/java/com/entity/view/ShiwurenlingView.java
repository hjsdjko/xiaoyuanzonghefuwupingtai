package com.entity.view;

import com.entity.ShiwurenlingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 失物认领
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shiwurenling")
public class ShiwurenlingView extends ShiwurenlingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 审核状态的值
		*/
		private String shiwurenlingYesnoValue;



		//级联表 xiaoyuanshiwuzhaoling
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
				* 物品类型的值
				*/
				private String shiwuzhaolingValue;
			/**
			* 物品状态
			*/
			private Integer statusTypes;
				/**
				* 物品状态的值
				*/
				private String statusValue;
			/**
			* 失物招领 的 用户
			*/
			private Integer xiaoyuanshiwuzhaolingYonghuId;
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

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public ShiwurenlingView() {

	}

	public ShiwurenlingView(ShiwurenlingEntity shiwurenlingEntity) {
		try {
			BeanUtils.copyProperties(this, shiwurenlingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 审核状态的值
			*/
			public String getShiwurenlingYesnoValue() {
				return shiwurenlingYesnoValue;
			}
			/**
			* 设置： 审核状态的值
			*/
			public void setShiwurenlingYesnoValue(String shiwurenlingYesnoValue) {
				this.shiwurenlingYesnoValue = shiwurenlingYesnoValue;
			}





































				//级联表的get和set xiaoyuanshiwuzhaoling

					/**
					* 获取： 失物编号
					*/
					public String getXiaoyuanshiwuzhaolingUuidNumber() {
						return xiaoyuanshiwuzhaolingUuidNumber;
					}
					/**
					* 设置： 失物编号
					*/
					public void setXiaoyuanshiwuzhaolingUuidNumber(String xiaoyuanshiwuzhaolingUuidNumber) {
						this.xiaoyuanshiwuzhaolingUuidNumber = xiaoyuanshiwuzhaolingUuidNumber;
					}

					/**
					* 获取： 物品名称
					*/
					public String getXiaoyuanshiwuzhaolingName() {
						return xiaoyuanshiwuzhaolingName;
					}
					/**
					* 设置： 物品名称
					*/
					public void setXiaoyuanshiwuzhaolingName(String xiaoyuanshiwuzhaolingName) {
						this.xiaoyuanshiwuzhaolingName = xiaoyuanshiwuzhaolingName;
					}

					/**
					* 获取： 物品类型
					*/
					public Integer getShiwuzhaolingTypes() {
						return shiwuzhaolingTypes;
					}
					/**
					* 设置： 物品类型
					*/
					public void setShiwuzhaolingTypes(Integer shiwuzhaolingTypes) {
						this.shiwuzhaolingTypes = shiwuzhaolingTypes;
					}


						/**
						* 获取： 物品类型的值
						*/
						public String getShiwuzhaolingValue() {
							return shiwuzhaolingValue;
						}
						/**
						* 设置： 物品类型的值
						*/
						public void setShiwuzhaolingValue(String shiwuzhaolingValue) {
							this.shiwuzhaolingValue = shiwuzhaolingValue;
						}

					/**
					* 获取： 物品状态
					*/
					public Integer getStatusTypes() {
						return statusTypes;
					}
					/**
					* 设置： 物品状态
					*/
					public void setStatusTypes(Integer statusTypes) {
						this.statusTypes = statusTypes;
					}


						/**
						* 获取： 物品状态的值
						*/
						public String getStatusValue() {
							return statusValue;
						}
						/**
						* 设置： 物品状态的值
						*/
						public void setStatusValue(String statusValue) {
							this.statusValue = statusValue;
						}

					/**
					* 获取：失物招领 的 用户
					*/
					public Integer getXiaoyuanshiwuzhaolingYonghuId() {
						return xiaoyuanshiwuzhaolingYonghuId;
					}
					/**
					* 设置：失物招领 的 用户
					*/
					public void setXiaoyuanshiwuzhaolingYonghuId(Integer xiaoyuanshiwuzhaolingYonghuId) {
						this.xiaoyuanshiwuzhaolingYonghuId = xiaoyuanshiwuzhaolingYonghuId;
					}


					/**
					* 获取： 物品图片
					*/
					public String getXiaoyuanshiwuzhaolingPhoto() {
						return xiaoyuanshiwuzhaolingPhoto;
					}
					/**
					* 设置： 物品图片
					*/
					public void setXiaoyuanshiwuzhaolingPhoto(String xiaoyuanshiwuzhaolingPhoto) {
						this.xiaoyuanshiwuzhaolingPhoto = xiaoyuanshiwuzhaolingPhoto;
					}

					/**
					* 获取： 拾遗时间
					*/
					public Date getXiaoyuanshiwuzhaolingTime() {
						return xiaoyuanshiwuzhaolingTime;
					}
					/**
					* 设置： 拾遗时间
					*/
					public void setXiaoyuanshiwuzhaolingTime(Date xiaoyuanshiwuzhaolingTime) {
						this.xiaoyuanshiwuzhaolingTime = xiaoyuanshiwuzhaolingTime;
					}

					/**
					* 获取： 拾遗地址
					*/
					public String getXiaoyuanshiwuzhaolingDizhi() {
						return xiaoyuanshiwuzhaolingDizhi;
					}
					/**
					* 设置： 拾遗地址
					*/
					public void setXiaoyuanshiwuzhaolingDizhi(String xiaoyuanshiwuzhaolingDizhi) {
						this.xiaoyuanshiwuzhaolingDizhi = xiaoyuanshiwuzhaolingDizhi;
					}

					/**
					* 获取： 详情
					*/
					public String getXiaoyuanshiwuzhaolingContent() {
						return xiaoyuanshiwuzhaolingContent;
					}
					/**
					* 设置： 详情
					*/
					public void setXiaoyuanshiwuzhaolingContent(String xiaoyuanshiwuzhaolingContent) {
						this.xiaoyuanshiwuzhaolingContent = xiaoyuanshiwuzhaolingContent;
					}







				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}



}
