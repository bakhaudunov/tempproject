package org.example;

import org.example.Product;
import org.example.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) {
        // Add sample products
        productRepository.save(new Product("Laptop", "High-performance laptop", 1299.99, 10));
        productRepository.save(new Product("Smartphone", "Latest smartphone", 799.99, 15));
        productRepository.save(new Product("Headphones", "Noise-cancelling headphones", 149.99, 20));
        productRepository.save(new Product("Tablet", "10-inch tablet", 499.99, 8));
    }
}