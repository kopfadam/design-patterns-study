package com.designpatterns.abstractfactory;

public interface Horse {
    default void says(){
        System.out.println("Horse make a sound like neigh");
    };
    void preferredAction();
}
