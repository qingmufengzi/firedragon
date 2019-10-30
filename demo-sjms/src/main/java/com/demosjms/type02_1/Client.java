package com.demosjms.type02_1;

import java.util.HashMap;

public class Client {
    public static void invoker() {
        //父类存在的地方，子类就应该能够存在
        Father f = new Father();
        HashMap map = new HashMap();
        f.doSomething(map);
    }

    public static void main(String[] args) {
        invoker();
    }
}
