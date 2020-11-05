package com.itheima.test;

import com.itheima.dao.Persion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersion {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Persion persion = (Persion) context.getBean("persion01");
        System.out.println(persion);
        System.out.println("------------------");
        Persion persion02 = (Persion) context.getBean("persion02");
        System.out.println(persion02);
    }
}
