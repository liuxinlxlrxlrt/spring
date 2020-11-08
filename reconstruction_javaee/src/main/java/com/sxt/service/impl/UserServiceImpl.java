package com.sxt.service.impl;

import com.sxt.dao.UserDao;
import com.sxt.domain.User;
import com.sxt.factory.BeanFactory;

public class UserServiceImpl implements UserService {
    //    private UserDao userDao = BeanFactory.getBean("UserDaoImpl");
    private UserDao userDao = BeanFactory.getBean("userDao");

    @Override
    public User queryUserById(Integer id) {
        return userDao.queryUserById(id);
    }
}
