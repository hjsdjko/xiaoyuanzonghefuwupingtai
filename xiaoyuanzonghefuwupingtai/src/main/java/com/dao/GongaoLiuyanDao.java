package com.dao;

import com.entity.GongaoLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GongaoLiuyanView;

/**
 * 校园资讯评论 Dao 接口
 *
 * @author 
 */
public interface GongaoLiuyanDao extends BaseMapper<GongaoLiuyanEntity> {

   List<GongaoLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
