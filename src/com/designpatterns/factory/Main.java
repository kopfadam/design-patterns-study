package com.designpatterns.factory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory tigerFactory = new TigerFactory();
        AnimalFactory dogFactory = new DogFactory();

        Animal animal1 = tigerFactory.createAnimal();
        Animal animal2 = dogFactory.createAnimal();

        animal1.action();
        animal2.speak();
    }
}
