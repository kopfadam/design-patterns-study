package com.company.builder.second;

public final class ProductClass {
    private String startUpMessage;
    private String bodyType;
    private int noOfWheels;
    private int noOfHeadlights;
    private String endOperationsMessage;

    public ProductClass(String startUpMessage, String bodyType, int noOfWheels, int noOfHeadlights, String endOperationsMessage) {

        this.startUpMessage = startUpMessage;
        this.bodyType = bodyType;
        this.noOfWheels = noOfWheels;
        this.noOfHeadlights = noOfHeadlights;
        this.endOperationsMessage = endOperationsMessage;
    }

    @Override
    public String toString() {
        return "Product completed as:" +
                "startUpMessage='" + startUpMessage + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", noOfWheels=" + noOfWheels +
                ", noOfHeadlights=" + noOfHeadlights +
                ", endOperationsMessage='" + endOperationsMessage + '\'' +
                '}';
    }
}
