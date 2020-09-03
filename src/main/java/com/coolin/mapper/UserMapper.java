package com.coolin.mapper;


import com.coolin.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface UserMapper {
    //登录
    public User loginObject(User user);
    //注册
    public int register(User user);
    //获取用户表
    public List<User> findUser(HashMap<String, Object> condition);
    //查找管理员总数
    public String findCount(HashMap<String, Object> condition);
    //修改用户
    public int updateUser(User user);
    //删除用户
    public int del(Integer id);
    //批量删除
    public int delAll(String[] arr);
    //改变用户状态
    public int updateState(User user);


}
