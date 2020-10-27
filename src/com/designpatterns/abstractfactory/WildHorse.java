package com.designpatterns.abstractfactory;

public class WildHorse implements Horse{

    @Override
    public void preferredAction() {
        System.out.println("I walk at the mountain all day long");
    }
}
