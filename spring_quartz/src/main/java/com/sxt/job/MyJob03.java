package com.sxt.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyJob03 {
    @Scheduled(cron = "0/5 * * * * ? ")
    public void doTask(){
        System.out.println("定时任务的第三种实现方法");
    }
}
