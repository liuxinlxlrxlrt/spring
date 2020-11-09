package com.sxt.test;

import com.sxt.dao.DeptDao;
import com.sxt.dao.UserDao;
import com.sxt.dao.impl.DeptDaoImpl;
import com.sxt.dao.impl.UserDao2;
import com.sxt.proxy.ProxyFactory;
import com.sxt.dao.impl.UserDaoImpl;

public class TestUserDao {
    public static void main(String[] args) {
        //创建一个目标代理对象
        UserDao userDao = new UserDaoImpl();
        DeptDao deptDao = new DeptDaoImpl();
        //创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory(userDao);
        //得到代理对象
//        Object proxyInstance = proxyFactory.getProxyInstance();
//        System.out.println(proxyInstance.getClass().getSimpleName());
        //结果：$Proxy0
//        UserDao proxyUserDao = (UserDao) proxyFactory.getProxyInstance();
//        proxyUserDao.save();
//        proxyUserDao.delete();
//        DeptDao proxyDeptDao = (DeptDao) proxyFactory.getProxyInstance();
//        proxyDeptDao.update();
        UserDao2 proxyUserDao = (UserDao2) proxyFactory.getProxyInstance();
        proxyUserDao.update();
    }
}
