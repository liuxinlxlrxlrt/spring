package com.sxt.test;


import com.sxt.dao.impl.UserDaoImpl;
import com.sxt.proxy.ProxyFactory;

public class TestUserDao {
    public static void main(String[] args) {
        //创建一个目标对象
        UserDaoImpl daoImpl = new UserDaoImpl();
        //创建爱代理工厂
        ProxyFactory proxyFactory = new ProxyFactory(daoImpl);
        //得到代理对象
        Object instance = proxyFactory.getProxyInstance();

        System.out.println(instance.getClass().getSimpleName());
        //UserDaoImpl$$EnhancerByCGLIB$$8a315ef6

        UserDaoImpl instance1 = (UserDaoImpl)proxyFactory.getProxyInstance();
        instance1.save();
    }
}
