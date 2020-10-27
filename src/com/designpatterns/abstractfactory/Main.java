package com.designpatterns.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new PetAnimalFactory();
        Dog petDog = animalFactory.createDog();
        Horse petHorse = animalFactory.createHorse();

        petDog.says();
        petDog.preferredAction();
        petHorse.says();
        petHorse.preferredAction();

        System.out.println("**********************");

        AnimalFactory animalFactory1 = new WildAnimalFactory();
        Dog wildDog = animalFactory1.createDog();
        Horse wildHorse = animalFactory1.createHorse();

        wildDog.says();
        wildDog.preferredAction();
        wildHorse.says();
        wildHorse.preferredAction();
    }
}
