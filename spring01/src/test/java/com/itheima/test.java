package com.itheima;

import com.itheima.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    //测试scope属性
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) applicationContext.getBean("userDao");
        UserDao userDao2 = (UserDao) applicationContext.getBean("userDao");
        System.out.println(userDao1);
        System.out.println(userDao2);
        //结果一样:说明userspring的Bean存在一个
        // com.itheima.dao.impl.UserDaoImpl@3712b94
        //com.itheima.dao.impl.UserDaoImpl@3712b94

        //结果不一样：说明userspring的Bean存在多个
        //com.itheima.dao.impl.UserDaoImpl@53f65459
        //com.itheima.dao.impl.UserDaoImpl@3b088d51
    }

}
