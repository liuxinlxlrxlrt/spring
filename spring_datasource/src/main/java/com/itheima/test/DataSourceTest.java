package com.itheima.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ResourceBundle;

public class DataSourceTest {

    @Test
    public void testC3p0()throws Exception{
        //导入数据源坐标和数据库驱动坐标
        //创建数据源
        //数据源的基本连接数据
        //使用数据源获取连接资源和归还连接资源
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test?serverTimezone=UTC");
        dataSource.setUser("root");
        dataSource.setPassword("lx@lx19870613");

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    public void testDruid()throws Exception{
        DruidDataSource dataSource= new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("lx@lx19870613");
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    //测试c3p0,加载配置文件
    @Test
    public void test3()throws Exception{
        ResourceBundle rb =ResourceBundle.getBundle("jdbc");
        String driver = rb.getString("jdbc.driver");
        String url = rb.getString("jdbc.url");
        String username = rb.getString("jdbc.username");
        String password = rb.getString("jdbc.password");
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    /**
     * spring IOC容器配置c3p0数据源
     */
    @Test
    public void test4() throws Exception{
        ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) context.getBean("dataSourcec3p0");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    /**
     * spring IOC容器配置dbcp数据源
     */
    @Test
    public void test5() throws Exception{
        ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) context.getBean("dataSourcedbcp");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    /**
     * spring IOC容器配置durid数据源
     */
    @Test
    public void test6() throws Exception{
        ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) context.getBean("dataSourcedurid");
        DruidPooledConnection connection = (DruidPooledConnection) dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
