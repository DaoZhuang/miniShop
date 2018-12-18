package com.minishop.admin;

import com.minishop.common.service.CategoryService;
import com.minishop.common.utils.BaseController;
import com.minishop.common.utils.PageData;
import com.minishop.common.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("product")
public class CategoryController extends BaseController {

    @Autowired
    private CategoryService CategoryService;

    @GetMapping("catview")
    public ModelAndView catview(){
        ModelAndView mv = this.getModelAndView();
        mv.setViewName("admin/category/cat-list");
        return mv;
    }

    @GetMapping("catlist")
    public ResultData catList(){
        PageData pageData = this.getPageData();
        System.out.println(pageData);
        ResultData resultData = CategoryService.getList(pageData);
        return resultData;
    }
}
