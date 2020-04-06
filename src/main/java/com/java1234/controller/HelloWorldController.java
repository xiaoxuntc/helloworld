package com.java1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: helloworld
 * @description:
 * @author: Sean
 * @create: 2020-04-06 13:58
 **/
@Controller
public class HelloWorldController {

    /**
     * @Description: 使用@RestController可以省略@ResponseBody
     * @Method_Name:say
     *
     * @return java.lang.String
     * @Creation Date:2020/4/6
     * @Author Sean
     */
    @ResponseBody
    @RequestMapping("/helloWorld")
    public String say() {
        return "hello springboot";
    }
}
