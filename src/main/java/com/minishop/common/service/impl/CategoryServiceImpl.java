package com.minishop.common.service.impl;

import com.minishop.common.mapper.CategoryMapper;
import com.minishop.common.service.CategoryService;
import com.minishop.common.utils.PageData;
import com.minishop.common.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public ResultData getList(PageData pageData) {

        int count = categoryMapper.getCount(pageData);

        int page = 1;
        int limit = 50;
        if (pageData.getString("page") != null) {
            page = Integer.valueOf(pageData.getString("page"));
        }
        if (pageData.getString("limit") != null) {
            limit = Integer.valueOf(pageData.getString("limit"));
        }
        ResultData resultData = new ResultData(count,page,limit);
        pageData.put("startIndex", resultData.getStartIndex());
        pageData.put("limit", limit);

        List<Map<String, Object>> list = categoryMapper.getList(pageData);
        resultData.setCode("0");
        resultData.setCount(count);
        resultData.setData(list);
        return resultData;
    }
}
