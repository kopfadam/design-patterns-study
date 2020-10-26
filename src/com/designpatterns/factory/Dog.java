package com.designpatterns.factory;

public class Dog implements Animal{
    @Override
    public void speak() {
        System.out.println("Dog barks like bow wow");
    }

    @Override
    public void action() {
        System.out.println("Dog prefers eat bones");
    }
}
