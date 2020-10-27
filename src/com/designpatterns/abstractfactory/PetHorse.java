package com.designpatterns.abstractfactory;

public class PetHorse implements Horse{

    @Override
    public void preferredAction() {
        System.out.println("I stay at home all day long");
    }
}
