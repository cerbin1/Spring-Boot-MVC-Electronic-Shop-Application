package com.elektroniks;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryController {
    private CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @GetMapping("{categoryName}")
    public Category findOne(@PathVariable("categoryName") String name) {
        return categoryRepository.findOne(name);
    }

    @GetMapping("{categoryName}/products")
    public List<Product> findProducts(@PathVariable String categoryName) {
        return findOne(categoryName).getProducts();
    }

    @GetMapping("{categoryName}/products/{id}")
    public Product findProductWithId(@PathVariable String categoryName, @PathVariable long id) {
        return findOne(categoryName)
                .getProducts()
                .stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @PostMapping("{categoryName}/products}")
    public Product addProduct(
            @PathVariable String categoryName,
            @RequestParam String name,
            @RequestParam double price,
            @RequestParam boolean available
    ) {
        Category category = findOne(categoryName);
        List<Product> products = category.getProducts();
        Product newProduct = new Product(name, price, available);
        products.add(newProduct);
        category.setProducts(products);
        return newProduct;
    }

}
