package com.minishop.admin;

import com.minishop.common.mapper.AdminIndexMapper;
import com.minishop.common.utils.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.print.attribute.standard.PDLOverrideSupported;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("index")
public class IndexController {

    @Autowired
    private AdminIndexMapper adminIndexMapper;

    @GetMapping("test")
    public ModelAndView index(){
        System.out.println("请求成功！！！");
        ModelAndView mv = new ModelAndView();

        List<Map<String, Object>> list = adminIndexMapper.getIndex(new PageData());
        mv.addObject("map",list);
        mv.setViewName("admin/common/index");
        return mv;
    }

    @GetMapping("test2")
    public ModelAndView index2(){
        System.out.println("请求成功！！！");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index2");
        return mv;
    }


}
