package com.designpatterns.factory;

public class TigerFactory extends AnimalFactory{

    @Override
    public Animal createAnimal() {
        return new Tiger();
    }
}
