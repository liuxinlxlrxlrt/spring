package com.sxt.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工厂
 * 作用：创建代理类和代理对象
 */
public class ProxyFactory implements MethodInterceptor {
    //声明目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 得到代理对象
     */
    public Object getProxyInstance() {
        //1.创建一个子类对象的构造器
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(target.getClass());
        //3.设置回调,就是当前工厂对象
        //构建public class SubUserDaoImp extends UserDaoImpl{}子类对象
        enhancer.setCallback(this);
        //4.在内存中生成代理对象
        //SubUserDaoImp dao = new SubUserDaoImp();
        return enhancer.create();

    }

    /**
     * 拦截方法
     *
     * @param o           目标对象
     * @param method      目标对象所调用的方法
     * @param objects     方法的参数
     * @param methodProxy 方法代理
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        begin();

        Object invoke = method.invoke(target, objects);

        commit();

        return invoke;
    }

    private void begin() {
        System.out.println("得到Session");
        System.out.println("开启事务");
    }

    private void commit() {
        System.out.println("提交事务");
    }
}
