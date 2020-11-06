package com.itheima.controller;

import com.itheima.service.impl.UserService;
import com.itheima.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();

//        UserService userService = new UserServiceImpl();
//        userService.save();
        //结果：Exception in thread "main" java.lang.NullPointerException
        //因为没有容器拿userDao对象

    }
}
