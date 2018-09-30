package com.example.SpringBootDemo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/freemarker")
public class FreemarkerController {

    @RequestMapping("/hello1")
    public String hello(Map<String,Object> map) {
        System.out.println("freemarker+++++++++++++++++++++++++++++++#######@@@@@@@@@@@@@@");
        map.put("msg", "Hello Freemarker");
        return "hello1";
    }
}