package com.entity.view;

import com.entity.GongaoLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 校园资讯评论
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gongao_liuyan")
public class GongaoLiuyanView extends GongaoLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 gongao
			/**
			* 资讯标题
			*/
			private String gongaoName;
			/**
			* 资讯类型
			*/
			private Integer gongaoTypes;
				/**
				* 资讯类型的值
				*/
				private String gongaoValue;
			/**
			* 资讯图片
			*/
			private String gongaoPhoto;
			/**
			* 资讯详情
			*/
			private String gongaoContent;

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

	public GongaoLiuyanView() {

	}

	public GongaoLiuyanView(GongaoLiuyanEntity gongaoLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, gongaoLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
















				//级联表的get和set gongao

					/**
					* 获取： 资讯标题
					*/
					public String getGongaoName() {
						return gongaoName;
					}
					/**
					* 设置： 资讯标题
					*/
					public void setGongaoName(String gongaoName) {
						this.gongaoName = gongaoName;
					}

					/**
					* 获取： 资讯类型
					*/
					public Integer getGongaoTypes() {
						return gongaoTypes;
					}
					/**
					* 设置： 资讯类型
					*/
					public void setGongaoTypes(Integer gongaoTypes) {
						this.gongaoTypes = gongaoTypes;
					}


						/**
						* 获取： 资讯类型的值
						*/
						public String getGongaoValue() {
							return gongaoValue;
						}
						/**
						* 设置： 资讯类型的值
						*/
						public void setGongaoValue(String gongaoValue) {
							this.gongaoValue = gongaoValue;
						}

					/**
					* 获取： 资讯图片
					*/
					public String getGongaoPhoto() {
						return gongaoPhoto;
					}
					/**
					* 设置： 资讯图片
					*/
					public void setGongaoPhoto(String gongaoPhoto) {
						this.gongaoPhoto = gongaoPhoto;
					}

					/**
					* 获取： 资讯详情
					*/
					public String getGongaoContent() {
						return gongaoContent;
					}
					/**
					* 设置： 资讯详情
					*/
					public void setGongaoContent(String gongaoContent) {
						this.gongaoContent = gongaoContent;
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
