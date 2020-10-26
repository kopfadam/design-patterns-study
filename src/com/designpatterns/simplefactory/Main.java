package com.designpatterns.simplefactory;

public class Main {
    public static void main(String[] args) {

        SimpleFactory factory = new SimpleFactory();
        Animal animal1 = factory.createAnimal("Tiger");
        animal1.speak();

        Animal animal2 = factory.createAnimal("Dog");
        animal2.preferredAction();

        Animal animal3 = factory.createAnimal("Cat");
        animal3.speak();

    }
}
