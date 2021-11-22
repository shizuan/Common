package com.zuanshi.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Myjob2 {
    SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");

    //设置7值表达式， 每间隔3秒执行一次
    @Scheduled(cron = "0/3 * * * * ?")  //定时执行 过时不在执行
    //启动后多久执行 initialDelay 延迟毫秒数 fixedDelay 间隔多少毫秒执行，-1 为只执行一次
    // @Scheduled(initialDelay = 延迟的毫秒数,fixedDelay = 间隔多少毫秒执行一次)  //启动后执行 过时启动还会执行
    public void abc(){
        System.out.println("myjob2："+simple.format(new Date()));
    }
}
