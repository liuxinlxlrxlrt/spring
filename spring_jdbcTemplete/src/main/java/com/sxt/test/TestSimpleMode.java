package com.sxt.test;

import com.sxt.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class TestSimpleMode {

    /**
     * 要连接数据库
     * 1.创建数据源
     * 2.创建jdbcTemplete
     * 3.完成CRUD
     * @param args
     */
    public static void main(String[] args) {
        //1.创建数据源
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //2.设置连接参数
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mybatis?useUnicode=true&characterEncodeing=utf8&serverTimezone=UTC&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("lx@lx19870613");
        System.out.println(dataSource);

        //3.创建JdbcTemplete
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //4.让JdbcTemplete关联数据源
        jdbcTemplate.setDataSource(dataSource);
        
        //创建sql
//        String  sql1 = "insert into sys_user (name,address,birthday) values(?,?,?)";
//        Object[] objects= {"高圆圆","北京",new Date()};
//        jdbcTemplate.update(sql1,objects);
        String sql2 = "select count(*) from sys_user";
        Long count = jdbcTemplate.queryForObject(sql2, Long.class);
        System.out.println(count);

        /**
         * JdbcTemplete
         * update 做添加、修改、删除
         * queryForObject 查询单个对象(单行单列)
         *queryForList 返回一个集合
         *
         * 当你看到需要new 对象的时候，就应该考虑使用IOC
         * 当你看到需要set的时候，就应该考虑使用属性注入方式
         */
    }
}
