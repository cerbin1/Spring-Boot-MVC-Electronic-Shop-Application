package com.elektroniks;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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

    @PostMapping("{categoryName}/products")
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

    @PutMapping("{categoryName}/products")
    public Product updateProduct(
            @PathVariable String categoryName,
            @RequestParam int id,
            @RequestParam String name,
            @RequestParam double price,
            @RequestParam boolean available
    ) {
        Category category = findOne(categoryName);
        List<Product> products = category.getProducts();
        Product newProduct = new Product(name, price, available);
        products.forEach(product -> {
            if (product.getId() == id) {
                product.setName(newProduct.getName());
                product.setPrice(newProduct.getPrice());
                product.setAvailable(newProduct.isAvailable());
            }
        });
        category.setProducts(products);
        return newProduct;
    }

    @DeleteMapping("{categoryName}/products")
    public void deleteProduct(
            @PathVariable String categoryName,
            @RequestParam int id
    ) {
        Category category = findOne(categoryName);
        List<Product> products = category.getProducts().stream().filter(product -> product.getId() != id).collect(Collectors.toList());
        category.setProducts(products);
    }
}
