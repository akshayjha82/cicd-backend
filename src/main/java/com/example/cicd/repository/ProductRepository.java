package com.example.cicd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cicd.entity.Product;

public interface ProductRepository
extends JpaRepository<Product,Long> {
}