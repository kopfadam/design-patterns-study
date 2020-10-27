package com.designpatterns.abstractfactory;

public class PetDog implements Dog{
    @Override
    public void preferredAction() {
        System.out.println("I like something cooked for me");
    }
}
