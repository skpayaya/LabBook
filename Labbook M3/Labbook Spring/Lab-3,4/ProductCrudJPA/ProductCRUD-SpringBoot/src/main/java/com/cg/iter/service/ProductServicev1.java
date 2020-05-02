package com.cg.iter.service;

import java.util.List;

import com.cg.iter.entity.Product;
import com.cg.iter.entity.Productv1;

public interface ProductServicev1 {

	Productv1 insertProduct(Productv1 p);

	Productv1 getProductById(int id);

	List<Productv1> getAllProducts();

	void deleteProduct(int id);

	Productv1 updateProduct(Productv1 p);

}