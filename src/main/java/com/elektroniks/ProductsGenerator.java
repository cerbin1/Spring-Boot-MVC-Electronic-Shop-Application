package com.elektroniks;

import java.util.ArrayList;
import java.util.List;

public class ProductsGenerator {
    public static List<Product> getComputerProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Elite Boosted", 4049.0, "Gaming PC", true));
        products.add(new Product("Dell Vostro", 2749, "Office PC", true));
        products.add(new Product("Lenovo ThinkCentre", 2399, "Greate for home", false));
        return products;
    }


    public static List<Product> getLaptopsProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple Macbook Air 13", 3623.45, "Great battery capability", true));
        products.add(new Product("Acer Swift 1", 1999, "Good for multimedia", true));
        products.add(new Product("MacBook Pro Retina 15", 7978, "Best for programming", true));
        return products;
    }


    public static List<Product> getGamesProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("GTA V", 139, "+18", true));
        products.add(new Product("Battlefield 1", 113.99, "FPS, +18", false));
        products.add(new Product("FIFA 17", 85.99, "Football, +3", true));
        return products;
    }


    public static List<Product> getPeripheralsProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("SteelSeries Rival 100 Mouse", 245, "Gaming mouse", false));
        products.add(new Product("Logitech K120 Keyboard", 132, "Ergonomic keyboard", true));
        products.add(new Product("Logitech M142 Mouse + Keyboard", 184, "Ideal set for home and work", true));
        return products;
    }


    public static List<Product> getPrintersProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Xerox Phaser", 276.99, "Small printer, great for home", true));
        products.add(new Product("Copyland M444", 1265, "Professional device", false));
        products.add(new Product("Samsung K10", 100, "For school for small projects", false));
        return products;
    }


    public static List<Product> getAccessoriesProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("HDMI cable", 43, "Common cable", true));
        products.add(new Product("Mousepad", 15, "Mousepad", true));
        products.add(new Product("Laptop bag", 89, "For 14 - 15.6' notebooks", true));
        return products;
    }

}
