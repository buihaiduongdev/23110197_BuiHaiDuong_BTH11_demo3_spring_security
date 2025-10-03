package com.example.bth11.service;

import java.util.List;

import com.example.bth11.entity.Product;

public interface ProductServices {
	void delete(Long id);

	Product get(Long id);

	Product save(Product product);

	List<Product> listAll();
}