package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

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
