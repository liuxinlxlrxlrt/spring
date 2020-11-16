package com.itheima.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.itheima.domain.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.testng.annotations.Test;


import java.util.ResourceBundle;

public class JdbcTemplateTest {

    //spring 产生jdbcTemplate模板
    @Test
    public void test02() throws  Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        String sqlinsert = "insert into users(name,age) values(?,?)";
        int i = jdbcTemplate.update(sqlinsert, "许晴", "35");
        System.out.println(i);
    }

    //测试jdbcTemplate开发步骤
    @Test
    public void test1() throws Exception {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("jdbc");
        String driver = resourceBundle.getString("jdbc.driver");
        String url = resourceBundle.getString("jdbc.url");
        String username = resourceBundle.getString("jdbc.username");
        String password = resourceBundle.getString("jdbc.password");


        //创建数据源对象
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println("connection：" + connection);

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //设置数据源
        jdbcTemplate.setDataSource(dataSource);
        String sqlinsert = "insert into users(name,age) values(?,?)";
        int i = jdbcTemplate.update(sqlinsert, "唐艺昕", 25);
        System.out.println(i);
    }
}
