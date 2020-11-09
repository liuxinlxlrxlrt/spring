package com.sxt.dao;

/**
 * 代理类
 */
public class UserDaoProxy implements UserDao {
    //声明目标对象
    private UserDao userDao;

    public UserDaoProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("得到Session");
        System.out.println("开启事务");
        userDao.save();
        System.out.println("提交事务");
    }
}
