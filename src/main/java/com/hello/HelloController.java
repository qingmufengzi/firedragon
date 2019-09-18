package com.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这里的@RestController   相当于@ResponseBody + @Controller
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloSpringBoot() {
        return "Hello SpringBoot!";
    }

    @Value("${pageSize}")
    private Integer pageSize;
    @Value("${devName}")
    private String devName;
    @Value("${content}")
    private String content;

    @RequestMapping(value = "/showInfo", method = RequestMethod.GET)
    public String showInfo() {
        return "pageSize:" + pageSize + "  devName:" + devName + " content：" + content;
    }


    //属性封装到对象中提取
    @Autowired
    private Developer developer;

    @RequestMapping(value = "/developer", method = RequestMethod.GET)
    public String showDeveloper() {
        return developer.toString();
    }

    //templates的展示
    /*@RequestMapping(value = {"/t","/temp","/template"} ,method = RequestMethod.GET)
    public String showIndexHtml(){
        return "index";
    }*/

}