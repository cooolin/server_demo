package com.coolin.entity;

import java.util.Date;


public class User {
    private Integer id;
    private String userName;
    private String password;
    private String sex;
    private String phone;
    private String email;
    private String integral;
    private Date regTime;
    private String levelId;
    private String state;
    private Integer upNum;
    private Integer downNum;


    public User() {
    }

    public User(Integer id, String userName, String password, String sex, String phone, String email, String integral, Date regTime, String levelId, String state, Integer upNum, Integer downNum) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
        this.integral = integral;
        this.regTime = regTime;
        this.levelId = levelId;
        this.state = state;
        this.upNum = upNum;
        this.downNum = downNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public Integer getUpNum() {
        return upNum;
    }

    public void setUpNum(Integer upNum) {
        this.upNum = upNum;
    }

    public Integer getDownNum() {
        return downNum;
    }

    public void setDownNum(Integer downNum) {
        this.downNum = downNum;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", integral='" + integral + '\'' +
                ", regTime=" + regTime +
                ", levelId='" + levelId + '\'' +
                ", state='" + state + '\'' +
                ", upNum=" + upNum +
                ", downNum=" + downNum +
                '}';
    }
}
