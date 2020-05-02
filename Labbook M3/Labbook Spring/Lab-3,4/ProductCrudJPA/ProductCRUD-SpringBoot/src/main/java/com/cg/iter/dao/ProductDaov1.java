package com.cg.iter.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cg.iter.entity.Product;
import com.cg.iter.entity.Productv1;

@Component
public interface ProductDaov1 {
	public List<Productv1> getAllProducts();
	public Productv1 addProduct(Productv1 product);
	public Productv1 deleteProduct(int id);
	Productv1 updateProduct(Productv1 product);
	 
}