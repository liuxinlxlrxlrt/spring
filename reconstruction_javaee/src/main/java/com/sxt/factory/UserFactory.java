package com.sxt.factory;

import com.sxt.controller.UserController;
import com.sxt.dao.UserDao;
import com.sxt.dao.UserDaoImpl;
import com.sxt.service.impl.UserService;
import com.sxt.service.impl.UserService2Impl;

public class UserFactory {

    /**
     * 创建Dao
     */

    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }

    /**
     * 创建Service
     */
    public static UserService getUserService(){
        return new UserService2Impl();
    }


    /**
     * 创建Controller
     */
    public static UserController getUserController(){
        return new UserController();
    }
}
