package com.minishop.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("index")
public class IndexController {

    @GetMapping("test")
    public ModelAndView index(){
        System.out.println("请求成功！！！");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("common/index");
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
