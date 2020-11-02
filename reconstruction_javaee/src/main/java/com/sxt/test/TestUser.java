package com.sxt.test;

import com.sxt.controller.UserController;
import com.sxt.factory.BeanFactory;
import com.sxt.factory.UserFactory;

public class TestUser {
    public static void main(String[] args) {
        //创建UserController对象
//        UserController userController = BeanFactory.getBean("com.sxt.controler.UserController");
        UserController userController = BeanFactory.getBean("userController");
//        UserController userController = (UserController) BeanFactory.ioc.get("userController");
        userController.queryUserById();
    }
}
