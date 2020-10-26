package com.designpatterns.builder.second;

public interface ModifiedBuilder {
    ModifiedBuilder startUpOperations(String message);
    ModifiedBuilder buildBody(String bodyType);
    ModifiedBuilder insertWheels(int noOfWheels);
    ModifiedBuilder addHeadlights(int noOfHeadlights);
    ModifiedBuilder endOperations(String message);
    ProductClass constructCar();
    ProductClass getConstructedCar();
}
