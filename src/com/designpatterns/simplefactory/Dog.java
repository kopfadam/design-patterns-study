package com.designpatterns.simplefactory;

public class Dog implements Animal{
    @Override
    public void speak() {
        System.out.println("Dog barks like bow wow");
    }

    @Override
    public void preferredAction() {
        System.out.println("Dog prefers eat bones");
    }
}
