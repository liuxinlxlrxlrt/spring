package com.sxt.proxy;

import com.sxt.dao.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工厂
 * 作用：创建代理类和代理对象
 */
public class ProxyFactory{
    //声明目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 参数说明：
     * ClassLoader loader,：类加载器
     * Class<?>[] interfaces：目标类实现的所有接口数组
     * InvocationHandler h：当代理对象被创建时，调用目标对象的方法时触发的方法回调
     * @return
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     *
                     * @param proxy ：代理对象
                     * @param method ：用户要调用的目标对象的方法
                     * @param args ：目标对象的方法的参数
                     * @return
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        begin();
                        //执行目标对象的方法
                        Object invoke = method.invoke(target, args);
                        commit();
                        return invoke;
                    }
                }
        );
    }

    private void begin(){
        System.out.println("得到Session");
        System.out.println("开启事务");
    }

    private void commit(){
        System.out.println("提交事务");
    }

}
