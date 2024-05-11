package com.dao;

import com.entity.GongaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GongaoView;

/**
 * 校园资讯 Dao 接口
 *
 * @author 
 */
public interface GongaoDao extends BaseMapper<GongaoEntity> {

   List<GongaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
