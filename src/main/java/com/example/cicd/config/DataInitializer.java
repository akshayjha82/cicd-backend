package com.example.cicd.config;

import com.example.cicd.entity.Product;
import com.example.cicd.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner init(ProductRepository repo) {
        return args -> {

            repo.save(new Product(null, "Laptop", 50000));
            repo.save(new Product(null, "Asus", 78900));
            repo.save(new Product(null, "Phone", 30000));
        };
    }
}

