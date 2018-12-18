package com.minishop.common.mapper;

import com.minishop.common.utils.PageData;

import java.util.List;
import java.util.Map;

public interface CategoryMapper {
    //获取一级分类总条数
    Integer getCount(PageData pageData);
    //获取一级分类
    List<Map<String,Object>> getList(PageData pageData);
}
