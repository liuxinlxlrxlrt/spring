package com.sxt.service.impl;

import com.sxt.dao.UserDao;
import com.sxt.domain.User;
import com.sxt.factory.UserFactory;

public class UserService2Impl implements UserService {
    //    private UserDao userDao = new UserDaoImpl();
    private UserDao userDao = UserFactory.getUserDao();

    @Override
    public User queryUserById(Integer id) {
        return userDao.queryUserById(id);
    }
}
