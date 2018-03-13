package com.elektroniks;

public class Product {
    private static int next_id;

    private int id;
    private String name;
    private double price;
    private boolean available;

    Product(String name, double price, boolean available) {
        id = getNextProductId();
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public int getId() {
        return id;
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
        return next_id++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
