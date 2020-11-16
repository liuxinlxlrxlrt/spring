package com.sxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestApp {
    public static void main(String[] args) {
        //加载spring的IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext03.xml");
    }
}
