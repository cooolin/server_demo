package com.coolin.controller;

import com.coolin.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getUser")
    public Object getUser(){
        System.out.println("请求开始");

        return this.restTemplate.getForObject("http://server-demo/user/reg", User.class);
    }
}
