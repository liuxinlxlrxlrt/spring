package com.itheima.test;

import com.itheima.dao.Animal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class TestAnimalList {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Animal animal01 = (Animal) context.getBean("animal01");
        System.out.println(animal01.getStringList());
        System.out.println(animal01.getUser01List());
        System.out.println("---------------------------------------------------------");
        Animal animal02 = (Animal) context.getBean("animal02");
        System.out.println(animal02.getStrSet());
        System.out.println(animal02.getUser01Set());
        System.out.println("---------------------------------------------------------");
        Animal animal03 = (Animal) context.getBean("animal03");
        System.out.println(animal03.getStrMap());
        System.out.println(animal03.getUser01Map());
        System.out.println("---------------------------------------------------------");
        Animal animal04 = (Animal) context.getBean("animal04");
        System.out.println(Arrays.toString(animal04.getStrs()));
        System.out.println(Arrays.toString(animal04.getUser01s()));
        System.out.println("---------------------------------------------------------");
        Animal animal05 = (Animal) context.getBean("animal05");
        System.out.println(animal05.getProperties());
    }
}
