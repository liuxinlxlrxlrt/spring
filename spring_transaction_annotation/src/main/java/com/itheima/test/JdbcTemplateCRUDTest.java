package com.itheima.test;

import com.sxt.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @RunWith(SpringJUnit4ClassRunner.class) ：用springtest去跑测试
 * @ContextConfiguration("classpath:applicationContext.xml") ：执行文件
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateCRUDTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void updateTest(){
        String sqlupdate="update users set name=?,age=? where id=?";
        int i = jdbcTemplate.update(sqlupdate,  "关之琳", "26",1);
        System.out.println(i);
    }

    @Test
    public void deleteTest(){
        String sqldelete ="delete from users where id =?";
        int i = jdbcTemplate.update(sqldelete, 2);
        System.out.println(i);
    }

    @Test
    public void queryAllTest(){
        String sqlqueryall ="select * from users";
        List<User> userList = jdbcTemplate.query(sqlqueryall, new ResultSetExtractor<List<User>>() {
            @Override
            public List<User> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List<User> list= new ArrayList<>();
                while(resultSet.next()){
                    User user = new User();
                    user.setId(resultSet.getInt("id"));
                    user.setName(resultSet.getString("name"));
                    list.add(user);
                }
                return list;
            }
        });
        System.out.println(userList);
    }

    @Test
    public void queryOneTest(){
        String sqlqueryone ="select * from users where id=?";
        User user = jdbcTemplate.queryForObject(sqlqueryone,new BeanPropertyRowMapper<>(User.class),1);

        System.out.println(user);
    }

    @Test
    public void queryCountTest(){
        String sqlquerycount ="select count(*) from users";
        Integer integer = jdbcTemplate.queryForObject(sqlquerycount, Integer.class);
        System.out.println(integer);
    }

}
