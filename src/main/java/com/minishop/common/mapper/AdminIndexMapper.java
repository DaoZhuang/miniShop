package com.minishop.common.mapper;

import com.minishop.common.utils.PageData;

import java.util.List;
import java.util.Map;

public interface AdminIndexMapper {

    List<Map<String,Object>> getIndex(PageData pd);

}
