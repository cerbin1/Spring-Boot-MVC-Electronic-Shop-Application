package com.elektroniks;

public class Product {
    private static int id = 0;
    private String name;
    private double price;
    private String description;
    private boolean available;

    Product(String name, double price, String description, boolean available) {
        id = getNextProductId();
        this.name = name;
        this.price = price;
        this.description = description;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAvailable() {
        return available;
    }

    private static int getNextProductId() {
        return id++;
    }
}
