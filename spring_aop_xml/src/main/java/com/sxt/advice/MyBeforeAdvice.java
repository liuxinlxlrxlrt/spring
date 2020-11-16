package com.sxt.advice;


import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 前置通知/增强
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {
    /**
     *
     * @param method 目标方法
     * @param objects 目标方法参数
     * @param o 目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        before();
    }

    /**
     * 执行之前做的事
     */
    public void before(){
        System.out.println("饭前水果");
        System.out.println("搞一杯");
    }
}
