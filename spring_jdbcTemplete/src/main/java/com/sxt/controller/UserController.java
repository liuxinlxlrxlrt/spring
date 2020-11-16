package com.sxt.controller;

import com.sxt.domain.User;
import com.sxt.serivce.UserService;

import java.util.Date;

public class UserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * 添加
     */
    public void addUser(){
        User user=  new User("童飞","香港",new Date());
        this.userService.add(user);
    }
    /**
     * 修改
     */
    public void updateUser(){
        User user = new User();
        user.setId(4);
        user.setName("陈慧琳");
        user.setAddress("台湾");
        user.setBirthday(new Date());
        this.userService.update(user);
    }
    /**
     * 删除
     */
    public void deleteUser(){
        this.userService.delete(4);
    }
    /**
     * 查询条数
     */
    public void queryCount(){
        System.out.println(this.userService.queryCount());
    }
}
