package com.minishop.common.service.impl;

import com.minishop.common.mapper.AdminIndexMapper;
import com.minishop.common.service.AdminIndexServic;
import com.minishop.common.utils.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AdminIndexServiceImpl implements AdminIndexServic {

    @Autowired
    private AdminIndexMapper mapper;

    @Override
    public Map<String,Object> getList(PageData pd) {
        List<Map<String, Object>> headList = mapper.getHead(pd);
        List<Map<String, Object>> navList = mapper.getNav(pd);
        Map<String,Object> map = new HashMap<>();
        map.put("headList",headList);
        map.put("navList",navList);
        return map;
    }
}
