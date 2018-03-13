package com.elektroniks;

import java.util.List;

public interface CategoryRepository {
    List<Category> findAll();

    Category findOne(String name);
}
