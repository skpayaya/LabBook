package com.cg.iter.service;

import java.util.List;

import com.cg.iter.entity.Product;

public interface ProductService {

	Product insertProduct(Product p);

	Product getProductById(int id);

	List<Product> getAllProducts();

	void deleteProduct(int id);

	Product updateProduct(Product p);

}