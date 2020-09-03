package com.coolin.service.impl;


import com.coolin.entity.User;
import com.coolin.mapper.UserMapper;
import com.coolin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    public UserMapper userMapper;

    @Override
    public int register(User user) {
        int n = 0;
        n = userMapper.register(user);
        return n;
    }


}
