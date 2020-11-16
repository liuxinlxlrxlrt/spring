package com.sxt.dao.impl;

import com.sxt.dao.UserDao;
import com.sxt.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class UserDaoImpl implements UserDao {

//    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int add(User user) {
        String sql = "insert into sys_user(name,address,birthday)values(?,?,?)";
        Object[] objects= {user.getName(),user.getAddress(),user.getBirthday()};
        int num = jdbcTemplate.update(sql,objects);
        return num;
    }

    @Override
    public int update(User user) {
        String sql = "update sys_user set name=?,address=?,birthday=? where id=?";
        Object[] objects= {user.getName(),user.getAddress(),user.getBirthday(),user.getId()};
        int num = jdbcTemplate.update(sql,objects);
        return num;
    }

    @Override
    public int delete(Integer id) {
        String sql = "delete from sys_user where id=?";
        Object[] objects= {id};
        int num = jdbcTemplate.update(sql,objects);
        return num;
    }

    @Override
    public Long queryCount() {
        String sql = "select count(*) from sys_user";

        return jdbcTemplate.queryForObject(sql,Long.class);
    }

    @Override
    public User queryById(Integer uid) {
        String sql = "select * from sys_user where id=?";
        Object[] objects= {uid};
        return this.jdbcTemplate.queryForObject(sql,objects,new RowMapper<User>() {
            /**
             * @param resultSet 查询出来的结果集
             * @param i 行号
             * @return
             * @throws SQLException
             */
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                Date birthday = resultSet.getDate("birthday");
//                User user = new User(id,name,address,birthday);
//                return user;
                return null;
            }
        });
    }

    @Override
    public List<User> queryAll() {
        String sql = "select * from sys_user";
        jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public  User mapRow(ResultSet resultSet,int rowNum)  throws SQLException  {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                Date birthday = resultSet.getDate("birthday");
//                User user = new User(id,name,address,birthday);
//                return user;
                return null;
            }
        });
        return null;
    }

    @Override
    public List<User> queryForPage(int currentPage, int pageSize) {
        String sql = "select * from sys_user";
        Object[] objects ={(currentPage-1)*pageSize,pageSize};
        jdbcTemplate.query(sql,objects, new RowMapper<User>() {
            @Override
            public  User mapRow(ResultSet resultSet,int rowNum)  throws SQLException  {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                Date birthday = resultSet.getDate("birthday");
//                User user = new User(id,name,address,birthday);
//                return user;
                return null;
            }
        });
        return null;
    }
}
