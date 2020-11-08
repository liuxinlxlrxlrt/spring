package com.sxt.test;

import com.sxt.dao.UserDao;
import com.sxt.dao.UserDaoProxy;
import com.sxt.dao.impl.UserDaoImpl;

public class TestUserDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();

        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);

        userDaoProxy.save();
    }
}
