package com.shejimoshu.type02;

public class Client {
    public static void main(String[] args) {
        /*//产生三毛这个士兵
        Soldier sanMao = new Soldier();
        //给三毛一支枪
        sanMao.setGun(new ToyGun());
        sanMao.killEnemy();*/

        //产生三毛这个狙击手
        Snipper sanMao = new Snipper();
        sanMao.killEnemy(new AUG());
    }
}
