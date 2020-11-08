package com.sxt.service.impl;

import com.sxt.dao.impl.UserDao;
import com.sxt.domain.User;
import com.sxt.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User queryUserById(Integer id) {
        return userDao.queryUserById(id);
    }
}
