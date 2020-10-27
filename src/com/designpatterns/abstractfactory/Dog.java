package com.designpatterns.abstractfactory;

public interface Dog {
    default void says(){
        System.out.println("Dog make a sound like wow bow");
    };
    void preferredAction();
}
