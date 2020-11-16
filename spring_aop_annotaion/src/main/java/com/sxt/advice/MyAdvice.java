package com.sxt.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import sun.awt.SunHints;

/**
 * 通知
 */
@Component
@Aspect //让spring扫描时当前类时一个切面类
public class MyAdvice {
    /**
     * 执行之前做的事
     */
    @Before("execution(* com.sxt.domain.*.*(..))")
    public void before(){
        System.out.println("饭前水果");
        System.out.println("搞一杯");
    }

    /**
     * 执行之后做的事
     */
    @After("execution(* com.sxt.domain.*.*(..))")
    public void after(){
        System.out.println("饭后甜点");
        System.out.println("搞一根");
    }

    @Around("execution(* com.sxt.domain.*.*(..))")
    public Object around(ProceedingJoinPoint pj){
        Object obj = null;

        try {
            before();
            obj=pj.proceed();
            after();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return obj;
    }

    @AfterThrowing(value = "execution(* com.sxt.domain.*.*(..))", throwing = "tv")
    public void exception(Throwable tv) {
        System.out.println("产生异常：" + tv.getMessage());
    }
}
