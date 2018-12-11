package com.minishop.common.service;

import com.minishop.common.utils.PageData;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

public interface AdminIndexServic {
    Map<String,Object> getList(PageData pd);
}
