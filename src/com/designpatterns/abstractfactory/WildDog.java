package com.designpatterns.abstractfactory;

public class WildDog implements Dog{
    @Override
    public void preferredAction() {
        System.out.println("I should find something to eat");
    }
}
