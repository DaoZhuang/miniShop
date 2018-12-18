package com.minishop.common.service;

import com.minishop.common.utils.PageData;
import com.minishop.common.utils.ResultData;

public interface CategoryService {
    ResultData getList(PageData pageData);
}
