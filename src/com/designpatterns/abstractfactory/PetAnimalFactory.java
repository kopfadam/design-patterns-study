package com.designpatterns.abstractfactory;

public class PetAnimalFactory implements AnimalFactory{
    @Override
    public Dog createDog() {
        return new PetDog();
    }

    @Override
    public Horse createHorse() {
        return new PetHorse();
    }
}
