package com.sxt.service.impl;

import com.sxt.dao.impl.UserDao;
import com.sxt.dao.impl.UserDaoImpl;
import com.sxt.domain.User;
import com.sxt.factory.BeanFactory;
import com.sxt.factory.UserFactory;

public class UserServiceImpl implements UserService {
    //    private UserDao userDao = BeanFactory.getBean("com.sxt.dao.impl.UserDaoImpl");
    private UserDao userDao = BeanFactory.getBean("userDao");

    @Override
    public User queryUserById(Integer id) {
        return userDao.queryUserById(id);
    }
}
