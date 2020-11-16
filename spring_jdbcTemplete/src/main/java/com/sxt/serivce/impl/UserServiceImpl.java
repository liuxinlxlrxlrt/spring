package com.sxt.serivce.impl;

import com.sxt.dao.UserDao;
import com.sxt.domain.User;
import com.sxt.serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{

//    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public int add(User user) {

        return this.userDao.add(user);
    }

    @Override
    public int update(User user) {
        return this.userDao.update(user);
    }

    @Override
    public int delete(Integer id) {
        return this.userDao.delete(id);
    }

    @Override
    public Long queryCount() {
        return this.userDao.queryCount();
    }

    @Override
    public User queryById(Integer id) {
        return this.userDao.queryById(id);
    }

    @Override
    public List<User> queryAll() {
        return this.userDao.queryAll();
    }

    @Override
    public List<User> queryForPage(int currentPage, int pageSize) {
        return this.userDao.queryForPage(currentPage,pageSize);
    }
}
