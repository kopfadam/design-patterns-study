package com.designpatterns.abstractfactory;

public class WildAnimalFactory implements AnimalFactory{
    @Override
    public Dog createDog() {
        return new WildDog();
    }

    @Override
    public Horse createHorse() {
        return new WildHorse();
    }
}
