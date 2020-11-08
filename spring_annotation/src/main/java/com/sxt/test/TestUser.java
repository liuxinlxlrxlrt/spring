package com.sxt.test;

import com.sxt.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserController userController = (UserController) context.getBean("userController");
        UserController userController = (UserController) context.getBean(UserController.class);
        userController.queryUserById();
    }
}
