package com.designpatterns.builder;

import java.util.LinkedList;

public class Product {
    private LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<>();
    }

    public void add(String part){
        parts.addLast(part);
    }

    public void showProduct(){
        System.out.println("Final product:");
        for (String part:
             parts) {
            System.out.println(part);
        }
    }
}
