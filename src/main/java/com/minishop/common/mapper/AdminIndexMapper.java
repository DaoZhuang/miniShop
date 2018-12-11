package com.minishop.common.mapper;

import com.minishop.common.utils.PageData;

import java.util.List;
import java.util.Map;

public interface AdminIndexMapper {
    //获取首页 顶部 父类菜单
    List<Map<String,Object>> getHead(PageData pd);
    //获取首页 边侧栏 菜单
    List<Map<String,Object>> getNav(PageData pd);

}
