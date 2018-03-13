package com.elektroniks;

import java.util.ArrayList;
import java.util.List;

public class ProductsGenerator {
    public static List<Product> getComputerProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Elite Boosted", 4049.0, true));
        products.add(new Product("Dell Vostro", 2749, true));
        products.add(new Product("Lenovo ThinkCentre", 2399, false));
        return products;
    }


    public static List<Product> getLaptopsProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple Macbook Air 13", 3623.45, true));
        products.add(new Product("Acer Swift 1", 1999, true));
        products.add(new Product("MacBook Pro Retina 15", 7978, true));
        return products;
    }


    public static List<Product> getGamesProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("GTA V", 139, true));
        products.add(new Product("Battlefield 1", 113.99, false));
        products.add(new Product("FIFA 17", 85.99, true));
        return products;
    }


    public static List<Product> getPeripheralsProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("SteelSeries Rival 100 Mouse", 245, false));
        products.add(new Product("Logitech K120 Keyboard", 132, true));
        products.add(new Product("Logitech M142 Mouse + Keyboard", 184, true));
        return products;
    }


    public static List<Product> getPrintersProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Xerox Phaser", 276.99, true));
        products.add(new Product("Copyland M444", 1265, false));
        products.add(new Product("Samsung K10", 100, false));
        return products;
    }


    public static List<Product> getAccessoriesProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("HDMI cable", 43, true));
        products.add(new Product("Mousepad", 15, true));
        products.add(new Product("Laptop bag", 89, true));
        return products;
    }

}
