package com.demo.demosjms.type03;

public class Benz implements ICar {
    //汽车肯定会跑
    @Override
    public void run() {
        System.out.println("奔驰汽车开始运行...");
    }
}
