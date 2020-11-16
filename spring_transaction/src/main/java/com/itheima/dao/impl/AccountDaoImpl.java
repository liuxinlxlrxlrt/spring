package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoImpl implements AccountDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void in(String outMan, double money) {
        String sql = "update account set money=money+? where name=?";
        jdbcTemplate.update(sql,money,outMan);
    }

    @Override
    public void out(String inMan, double money) {
        String sql = "update account set money=money-? where name=?";
        jdbcTemplate.update(sql,money,inMan);

    }
}
