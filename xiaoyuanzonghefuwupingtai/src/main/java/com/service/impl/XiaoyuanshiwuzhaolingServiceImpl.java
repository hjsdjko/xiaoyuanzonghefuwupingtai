package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.XiaoyuanshiwuzhaolingDao;
import com.entity.XiaoyuanshiwuzhaolingEntity;
import com.service.XiaoyuanshiwuzhaolingService;
import com.entity.view.XiaoyuanshiwuzhaolingView;

/**
 * 失物招领 服务实现类
 */
@Service("xiaoyuanshiwuzhaolingService")
@Transactional
public class XiaoyuanshiwuzhaolingServiceImpl extends ServiceImpl<XiaoyuanshiwuzhaolingDao, XiaoyuanshiwuzhaolingEntity> implements XiaoyuanshiwuzhaolingService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<XiaoyuanshiwuzhaolingView> page =new Query<XiaoyuanshiwuzhaolingView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
