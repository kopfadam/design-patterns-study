package com.designpatterns.builder.second;

public class CarBuilder implements ModifiedBuilder{

    private String startUpMessage = "Start building the product";
    private String bodyType = "Steel";
    private int noOfWheels = 4;
    private int noOfHeadlights = 2;
    private String endOperationsMessage = "Product creation finished";

    private ProductClass product;
    public CarBuilder() {
    }

    @Override
    public ModifiedBuilder startUpOperations(String message) {
        this.startUpMessage = message;
        return this;
    }

    @Override
    public ModifiedBuilder buildBody(String bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    @Override
    public ModifiedBuilder insertWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
        return this;
    }

    @Override
    public ModifiedBuilder addHeadlights(int noOfHeadlights) {
        this.noOfHeadlights = noOfHeadlights;
        return this;
    }

    @Override
    public ModifiedBuilder endOperations(String message) {
        this.endOperationsMessage = message;
        return this;
    }

    @Override
    public ProductClass constructCar() {
        product = new ProductClass(this.startUpMessage, this.bodyType, this.noOfWheels, this.noOfHeadlights, this.endOperationsMessage);
        return product;
    }

    @Override
    public ProductClass getConstructedCar() {
        return product;
    }
}
