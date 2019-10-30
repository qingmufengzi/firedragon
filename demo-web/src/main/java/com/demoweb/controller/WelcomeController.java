package com.demoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
    /**
     * 访问welcome.jsp页面
     *
     * @return
     */
    @RequestMapping("welcomeIndex")
    public ModelAndView welcomeIndex() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("views/test");
        mv.addObject("name", "xx");
        return mv;
    }

    @RequestMapping("welcomeIndex1")
    @ResponseBody
    public String welcomeIndex1() {
        return "123";
    }

}