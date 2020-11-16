package com.sxt.domain;

import org.springframework.stereotype.Component;

/**
 * 目标类
 */
@Component
public class Man {
    public void eat(){
        System.out.println("吃饭");
        int a=10/0;
    }
}
