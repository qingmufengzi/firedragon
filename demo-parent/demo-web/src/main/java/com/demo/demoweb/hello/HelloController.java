package com.demo.demoweb.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 这里的@RestController   相当于@ResponseBody + @Controller
 */
@Controller
@RequestMapping("/welcome")
public class HelloController {
    @RequestMapping("hello")
    @ResponseBody
    public String helloSpringBoot() {
        return "Hello SpringBoot!";
    }

    @RequestMapping("welcomeIndex")
    public ModelAndView welcomeIndex() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("welcome");
        return mv;
    }

    /*@Value("${pageSize}")
    private Integer pageSize;
    @Value("${devName}")
    private String devName;
    @Value("${content}")
    private String content;*/

    /*@RequestMapping(value = "/showInfo", method = RequestMethod.GET)
    public String showInfo() {
        return "pageSize:" + pageSize + "  devName:" + devName + " content：" + content;
    }


    //属性封装到对象中提取
    @Autowired
    private Developer developer;*/

    Logger logger = LoggerFactory.getLogger(HelloController.class);


    /*@RequestMapping(value = "/developer", method = RequestMethod.GET)
    public String showDeveloper() throws InterruptedException {
        return developer.toString();
    }*/

    //templates的展示   要配合template的jar一起使用
    /*@RequestMapping(value = {"/t", "/temp", "/template"}, method = RequestMethod.GET)
    public String showIndexHtml() {
        return "test";
    }*/

}