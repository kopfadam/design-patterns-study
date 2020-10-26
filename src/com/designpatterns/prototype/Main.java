package com.designpatterns.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("**** Prototype Pattern Demo ****");

        BasicCar nanoCar = new Nano("ModelX");
        nanoCar.basePrice = 100000;

        BasicCar mustang = new Ford("Mustang");
        mustang.basePrice = 250000;

        BasicCar bc1;

        bc1 = nanoCar.clone();
        bc1.onRoadPrice = nanoCar.basePrice + BasicCar.setAdditionalPrice();
        System.out.println("Car is: " + bc1.modelName + " and it's price is Rs." + bc1.onRoadPrice + " base price is: " + bc1.basePrice);

        bc1 = mustang.clone();
        bc1.onRoadPrice = mustang.basePrice + BasicCar.setAdditionalPrice();
        System.out.println("Car is: " + bc1.modelName + " and it's price is Rs." + bc1.onRoadPrice + " base price is: " + bc1.basePrice);
    }
}
