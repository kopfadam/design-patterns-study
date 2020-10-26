package com.designpatterns.simplefactory;

public class Tiger implements Animal{
    @Override
    public void speak() {
        System.out.println("Tiger says halum");
    }

    @Override
    public void preferredAction() {
        System.out.println("Tiger prefers eat meat");
    }
}
