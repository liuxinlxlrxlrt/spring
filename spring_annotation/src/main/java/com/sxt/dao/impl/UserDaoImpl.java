package com.sxt.dao.impl;

import com.sxt.dao.UserDao;
import com.sxt.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository：告诉spring的IOC容器创建一个UserDaoImpl对象 id=userDaoImpl
//不写value = "userDaoImpl"，默认id=userDaoImpl

//@Component
@Repository
public class UserDaoImpl implements UserDao {
//    @Override
//    public User queryUserById(Integer id) {
//        User user = null;
//        switch (id) {
//            case 1:
//                user = new User(1, "小明", "武汉");
//                break;
//            case 2:
//                user = new User(2, "老张", "上海");
//                break;
//            case 3:
//                user = new User(3, "老周", "深圳");
//                break;
//        }
//        return user;
//    }

    @Override
    public int add(User user) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }

    @Override
    public Long queryCount() {
        return null;
    }

    @Override
    public User queryById(Integer id) {
        return null;
    }

    @Override
    public List<User> queryAll() {
        return null;
    }

    @Override
    public List<User> queryForPage(int currentPage, int pageSize) {
        return null;
    }
}
