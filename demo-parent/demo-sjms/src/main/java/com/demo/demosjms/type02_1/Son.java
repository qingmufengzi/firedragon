package com.demo.demosjms.type02_1;

import java.util.Collection;
import java.util.Map;

public class Son extends Father {
    //放大输入参数类型
    public Collection doSomething(Map map) {
        System.out.println("子类被执行...");
        return map.values();
    }
}
