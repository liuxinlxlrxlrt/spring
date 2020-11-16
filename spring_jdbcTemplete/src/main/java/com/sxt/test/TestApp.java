package com.sxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestApp {
    public static void main(String[] args) {
        //加载spring的IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //得到JdbcTemplate
        JdbcTemplate jdbcTemplate  = (JdbcTemplate) context.getBean("jdbcTemplate");

        String sql2 = "select count(*) from sys_user";
        Long count = jdbcTemplate.queryForObject(sql2, Long.class);
        System.out.println(count);
    }
}
