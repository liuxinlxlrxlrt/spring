package com.sxt.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdevice implements MethodInterceptor {

    /**
     *
     * @param methodInvocation 目标方法执行对象
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        before();
        //执行目标对象
        Object proceed = methodInvocation.proceed();
        after();
        return proceed;
    }

    /**
     * 执行之前做的事
     */
    public void before(){
        System.out.println("饭前水果");
        System.out.println("搞一杯");
    }

    /**
     * 执行之后做的事
     */
    public void after(){
        System.out.println("饭后甜点");
        System.out.println("搞一根");
    }
}
