package com.sxt.dao.impl;

import com.sxt.dao.UserDao;

/**
 * 目标类
 */
public class UserDaoImpl implements UserDao,UserDao2 {
    @Override
    public void save() {
        System.out.println("用户保存操作");
    }

    @Override
    public void delete() {
        System.out.println("用户删除操作");
    }

    @Override
    public void update() {
        System.out.println("用户更新操作");
    }
}
