package com.designpatterns.factory;

public class Tiger implements Animal{
    @Override
    public void speak() {
        System.out.println("Tiger says halum");
    }

    @Override
    public void action() {
        System.out.println("Tiger prefers eat meat");
    }
}
