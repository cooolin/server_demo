package com.coolin.controller;

import com.coolin.entity.User;
import com.coolin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    UserService userService;

    @RequestMapping("/index")
    public String hello(){
        return "传奇大傻子";
    }//修改by袁文杰

    @RequestMapping("/user")
    public Object user(){
        User user =new User();
        user.setId(111);
        return user;
    }

    @RequestMapping("/reg")
    public Object reg(){
        User user =new User();
        user.setId(111);
        user.setUserName("小文杰");
        user.setPassword("1111111");
        int n = userService.register(user);
        return user;
    }



}
