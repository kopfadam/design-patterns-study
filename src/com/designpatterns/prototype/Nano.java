package com.designpatterns.prototype;

public class Nano extends BasicCar{

    public Nano(String model){
        modelName = model;
        basePrice = 100000;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Nano)super.clone();
    }
}
