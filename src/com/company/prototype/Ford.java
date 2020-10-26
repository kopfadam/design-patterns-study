package com.company.prototype;

public class Ford extends BasicCar{

    public Ford(String model){
        modelName = model;
        basePrice = 140000;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }
}
