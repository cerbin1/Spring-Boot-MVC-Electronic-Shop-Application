package com.elektroniks;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ShopApplication implements CategoryRepository {
    private List<Category> categories = Arrays.asList(new Category("computers"),
            new Category("laptops"),
            new Category("games"),
            new Category("peripherals"),
            new Category("printers"),
            new Category("accessories"));

    @Override
    public List<Category> findAll() {
        return new ArrayList<>(categories);
    }

    @Override
    public Category findOne(String name) {
        return categories
                .stream()
                .filter(c -> c.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
