package com.minishop.common.service.impl;

import com.minishop.common.mapper.AdminIndexMapper;
import com.minishop.common.service.AdminIndexServic;
import com.minishop.common.utils.PageData;
import org.apache.commons.lang3.StringUtils;
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

    /**
     * 首页菜单 service
     * @param pd
     * @return
     */
    @Override
    public Map<String,Object> getList(PageData pd) {
        List<Map<String, Object>> headList = mapper.getHead(pd);
        if (StringUtils.isBlank(pd.getString("index"))){
            pd.put("index","1");
        }
        List<Map<String, Object>> navList = mapper.getNav(pd);
        Map<String,Object> map = new HashMap<>();
        map.put("headList",headList);
        map.put("navList",navList);
        return map;
    }
}
