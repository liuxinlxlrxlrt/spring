package com.itheima.dao;

public interface AccountDao {
    void in(String inMan,double money);
    void out(String outMan,double money);
}
