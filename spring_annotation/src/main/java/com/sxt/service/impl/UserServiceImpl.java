package com.sxt.service.impl;

import com.sxt.dao.impl.UserDao;
import com.sxt.domain.User;
import com.sxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Service：告诉spring的IOC容器创建一个UserServiceImpl对象 id=userServiceImpl
//不写value = "userServiceImpl"，默认id=userServiceImpl

//@Component
@Service
public class UserServiceImpl implements UserService {

    //@Autowired：从IOC容器中找对应的该类型的对象去赋值
    @Autowired
    private UserDao userDao;

    @Override
    public User queryUserById(Integer id) {
        return userDao.queryUserById(id);
    }
}
