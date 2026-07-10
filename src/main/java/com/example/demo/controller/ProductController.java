package com.example.demo.controller;

import com.example.demo.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController                  // Tells Spring this class handles HTTP endpoints
@RequestMapping("/api/products") // Sets the base URL path for everything in this class
public class ProductController {

    // A simple in-memory list to act as our temporary database
    private final List<Product> productList = new ArrayList<>();

    public ProductController() {
        // Pre-populating our list with some data
        productList.add(new Product(1L, "Laptop", 999.99));
        productList.add(new Product(2L, "Smartphone", 499.99));
        productList.add(new Product(2L, "washingmachine", 700.99));
    }

    // GET Request: http://localhost:8080/api/products
    @GetMapping
    public List<Product> getAllProducts() {
        return productList;
    }

    // POST Request: http://localhost:8080/api/products
    @PostMapping
    public Product addProduct(@RequestBody Product newProduct) {
        productList.add(newProduct);
        return newProduct;
    }
}
