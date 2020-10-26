package com.company.builder;

public class Car implements Builder{
    private String brandName;
    private Product product;

    public Car(String brandName) {
        this.brandName = brandName;
        product = new Product();
    }

    @Override
    public void startUpOperations() {
        product.add("CAr model is " + brandName);
    }

    @Override
    public void buildBody() {
        product.add("Body of the car");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels added to car");
    }

    @Override
    public void addHeadlights() {
        product.add("2 headlights added");
    }

    @Override
    public void endOperations() {
        product.add("Car end operations");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
