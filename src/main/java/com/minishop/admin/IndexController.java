package com.minishop.admin;

import com.minishop.common.mapper.AdminIndexMapper;
import com.minishop.common.service.AdminIndexServic;
import com.minishop.common.utils.BaseController;
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
@RequestMapping("main")
public class IndexController extends BaseController {

    @Autowired
    private AdminIndexServic servic;

    @GetMapping("index")
    public ModelAndView index(){
        PageData pd = this.getPageData();
        ModelAndView mv = this.getModelAndView();
        Map<String,Object> map = servic.getList(pd);
        mv.addObject("menu",map);
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
