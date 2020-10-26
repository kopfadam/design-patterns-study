package com.company.builder;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        /*** First implementation ***/
        /*Builder fordCar = new Car("Ford");
        Builder motor = new Motorcycle("Honda");

        director.construct(fordCar);
        Product carProduct = fordCar.getVehicle();
        carProduct.showProduct();

        director.construct(motor);
        Product motorProduct = motor.getVehicle();
        motorProduct.showProduct();*/
        /***************************************/

        /*** Second implementation ***/

        /****************************************/

        for (int i = 10; i > 0; i = (i / 2)) {
            System.out.println(i);
        }
    }
}
