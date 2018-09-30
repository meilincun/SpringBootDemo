package com.example.SpringBootDemo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @GetMapping("/hello2")
    public String hello(Map<String,Object> map) {
    	System.out.println("shuchu@@@@@@@@@@@@@@@----------------$$$$$$$$$$$$$$3&&&&&&&&&&&&&&&&");
        map.put("msg", "Hello Thymeleaf");
        return "hello2";
    }
}
