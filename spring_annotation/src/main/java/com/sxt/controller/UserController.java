package com.sxt.controller;

import com.sxt.domain.User;
import com.sxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


//@Component
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void queryUserById(){
        int id =1;
        User user = userService.queryUserById(id);
        System.out.println(user);
    }
}
