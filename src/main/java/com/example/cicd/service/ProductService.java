package com.example.cicd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cicd.entity.Product;
import com.example.cicd.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product save(Product product) {
        return repository.save(product);
    }
}
