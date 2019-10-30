package com.demosjms.type03;

public class Driver implements IDriver {
    //司机的主要职责就是驾驶汽车
    @Override
    public void drive(ICar car) {
        car.run();
    }
}
