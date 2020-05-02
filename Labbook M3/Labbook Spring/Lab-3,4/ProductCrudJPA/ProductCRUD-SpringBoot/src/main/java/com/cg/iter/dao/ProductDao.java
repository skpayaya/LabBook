package com.cg.iter.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cg.iter.entity.Product;

@Component
public interface ProductDao {
	public List<Product> getAllProducts();
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public Product deleteProduct(int id);
	 
}