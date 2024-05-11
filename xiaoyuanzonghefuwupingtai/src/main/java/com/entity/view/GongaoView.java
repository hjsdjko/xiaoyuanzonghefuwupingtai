package com.entity.view;

import com.entity.GongaoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 校园资讯
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gongao")
public class GongaoView extends GongaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 资讯类型的值
		*/
		private String gongaoValue;



	public GongaoView() {

	}

	public GongaoView(GongaoEntity gongaoEntity) {
		try {
			BeanUtils.copyProperties(this, gongaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

















}
