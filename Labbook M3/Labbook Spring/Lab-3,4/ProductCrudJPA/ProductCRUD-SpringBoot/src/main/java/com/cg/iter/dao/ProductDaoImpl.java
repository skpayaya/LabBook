package com.cg.iter.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.iter.entity.Product;
import com.cg.iter.staticdb.ProductDB;

@Component
public class ProductDaoImpl implements ProductDao{
	
	
	static HashMap<Integer, Product> productIdMap = ProductDB.getProductIdMap();

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> Products = new ArrayList<Product>(productIdMap.values());
		return Products;
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		productIdMap.put(product.getId(),product);
		return product;
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		if (product.getId() <=0)
		return null;
		productIdMap.put(product.getId(), product);
		return product;
	}

	 

	@Override
	public Product deleteProduct (int id) {
		// TODO Auto-generated method stub
		return productIdMap.remove(id);
	}

	

	 

}