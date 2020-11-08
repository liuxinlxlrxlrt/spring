package com.sxt.controller;

import com.sxt.domain.User;
import com.sxt.service.UserService;

public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
    public void queryUserById(){
        int id =1;
        User user = userService.queryUserById(id);
        System.out.println(user);
    }
}
