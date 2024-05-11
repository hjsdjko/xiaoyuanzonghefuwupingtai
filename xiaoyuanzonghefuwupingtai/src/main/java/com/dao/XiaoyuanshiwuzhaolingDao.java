package com.dao;

import com.entity.XiaoyuanshiwuzhaolingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyuanshiwuzhaolingView;

/**
 * 失物招领 Dao 接口
 *
 * @author 
 */
public interface XiaoyuanshiwuzhaolingDao extends BaseMapper<XiaoyuanshiwuzhaolingEntity> {

   List<XiaoyuanshiwuzhaolingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
