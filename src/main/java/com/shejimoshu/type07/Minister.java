package com.shejimoshu.type07;

public class Minister {
    public static void main(String[] args) {
        for (int day = 0; day < 3; day++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
        //三天见的皇帝都是同一个人，荣幸吧！
    }
}
