package com.sxt.advice;

import org.springframework.aop.ThrowsAdvice;

public class MyExceptionAdvice implements ThrowsAdvice {
    /**
     * 异常增强方法
     * @param tv
     * @throws Exception
     */
    public void afterThrowing(Throwable tv) throws Exception{
        System.out.println("产生异常："+tv.getMessage());
    }
}
