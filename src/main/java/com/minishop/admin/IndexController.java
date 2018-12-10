package com.minishop.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("index")
public class IndexController {

    @RequestMapping("test")
    public ModelAndView index(){
        System.out.println("请求成功！！！");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("test2")
    public ModelAndView index2(){
        System.out.println("请求成功！！！");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index2");
        return mv;
    }

    @RequestMapping("test3")
    public ModelAndView index3(){
        System.out.println("请求成功！！！");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index2");
        return mv;
    }
}
