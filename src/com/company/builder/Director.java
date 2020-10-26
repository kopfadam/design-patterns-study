package com.company.builder;

public class Director {

    Builder builder;

    public Director() {
    }

    public void construct(Builder builder){
        this.builder = builder;
        builder.startUpOperations();
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadlights();
        builder.endOperations();
    }
}
