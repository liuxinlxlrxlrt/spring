package com.sxt.controller;

import com.sxt.domain.User;
import com.sxt.factory.UserFactory;
import com.sxt.service.impl.UserService;
import com.sxt.service.impl.UserServiceImpl;

public class EmpController {

    private UserService userService = UserFactory.getUserService();

    public void queryUserById(){
        int id = 1;
        User user = userService.queryUserById(id);
        System.out.println(user);
    }
}
