package com.example.cicd;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.cicd.service.ProductService;

@SpringBootTest
class ProductServiceTest {

	@Autowired
	private ProductService service;

	@Test
	void contextLoads() {
		assertNotNull(service);
	}
}