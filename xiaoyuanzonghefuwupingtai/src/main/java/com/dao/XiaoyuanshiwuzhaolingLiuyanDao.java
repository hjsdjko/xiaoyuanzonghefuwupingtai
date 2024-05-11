package com.dao;

import com.entity.XiaoyuanshiwuzhaolingLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyuanshiwuzhaolingLiuyanView;

/**
 * 失物招领评论 Dao 接口
 *
 * @author 
 */
public interface XiaoyuanshiwuzhaolingLiuyanDao extends BaseMapper<XiaoyuanshiwuzhaolingLiuyanEntity> {

   List<XiaoyuanshiwuzhaolingLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
