package com.zuanshi.job;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Myjob {
    SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");

    public void abc(){
        System.out.println(simple.format(new Date()));
    }
}
