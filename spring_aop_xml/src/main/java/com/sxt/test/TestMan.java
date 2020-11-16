package com.sxt.test;

import com.sxt.domain.Man;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMan {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Man man = context.getBean(Man.class);
        System.out.println(man.getClass().getSimpleName());
        man.eat();
    }
}
