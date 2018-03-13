package com.elektroniks;

public class Product {
    private static int id = 0;
    private String name;
    private double price;
    private boolean available;

    Product(String name, double price, boolean available) {
        id = getNextProductId();
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    private static int getNextProductId() {
        return id++;
    }
}
