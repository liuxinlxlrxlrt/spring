package com.sxt.test;

import com.sxt.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        //加载spring的IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = (UserController) context.getBean("userController");
//        userController.addUser();
//        userController.updateUser();
//        userController.deleteUser();
        userController.queryCount();
    }
}
