package com.itheima.test;

import com.itheima.dao.User01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User01 user01 = (User01) context.getBean("user01");
        User01 user02 = (User01) context.getBean("user01");
        System.out.println(user01);
        System.out.println(user02);
        //获取当前系统时间，调用Date的空构造刚发
        Object data = context.getBean("date01");
        System.out.println(data);

    }
}
