package com.sxt.dao.impl;

import com.sxt.dao.UserDao;

/**
 * 目标类
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("保存目标用户操作");
    }
}
