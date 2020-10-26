package com.designpatterns.simplefactory;

public class SimpleFactory{

    private Animal preferredAnimal;

    public Animal createAnimal(String animalType){
        preferredAnimal = null;

        switch (animalType){
            case "Tiger" : preferredAnimal = new Tiger();
            break;
            case "Dog": preferredAnimal = new Dog();
            break;
            default:
                System.out.println("You must enter either Tiger or Dog");
                throw new IllegalArgumentException();
        }


        return preferredAnimal;
    }

}
