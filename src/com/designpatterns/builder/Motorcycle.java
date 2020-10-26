package com.designpatterns.builder;

public class Motorcycle implements Builder{

    private String brandName;
    private Product product;

    public Motorcycle(String brandName) {
        this.brandName = brandName;
        product = new Product();
    }

    @Override
    public void startUpOperations() {
        product.add("Motorcycle start operations");

    }

    @Override
    public void buildBody() {
        product.add("Body of the motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels added to car");
    }

    @Override
    public void addHeadlights() {
        product.add("1 headlights added");
    }

    @Override
    public void endOperations() {
        product.add("Motorcycle model is " + brandName);
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
