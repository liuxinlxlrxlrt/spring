package com.sxt.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * 后置通知
 */
public class MyAfterAdvice implements AfterReturningAdvice  {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        after();
    }

    /**
     * 执行之后做的事
     */
    public void after(){
        System.out.println("饭后甜点");
        System.out.println("搞一根");
    }
}
