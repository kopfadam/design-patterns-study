package com.company.builder;

import com.company.builder.second.CarBuilder;
import com.company.builder.second.ProductClass;

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
        ProductClass customCar1 = new CarBuilder()
                .addHeadlights(5)
                .buildBody("Plastic")
                .insertWheels(4)
                .constructCar();

        System.out.println(customCar1);
        System.out.println("----------------------");

        CarBuilder carBuilder2 = new CarBuilder();
        ProductClass customCar2 = carBuilder2
                .startUpOperations("This is custom car 2")
                .addHeadlights(3)
                .buildBody("Copper")
                .insertWheels(2)
                .endOperations("Custom car 2 is finished")
                .constructCar();

        System.out.println(customCar2);
        System.out.println("----------------------");

        // verifying the constructedCar() method final
        ProductClass customCar3 = carBuilder2.getConstructedCar();
        System.out.println(customCar3);
        /****************************************/

    }
}
