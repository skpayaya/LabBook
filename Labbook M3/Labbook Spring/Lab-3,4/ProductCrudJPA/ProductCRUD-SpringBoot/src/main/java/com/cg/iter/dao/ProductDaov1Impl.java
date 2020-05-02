package com.cg.iter.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.iter.entity.Product;
import com.cg.iter.entity.Productv1;
import com.cg.iter.staticdb.ProductDBv1;

@Component
public class ProductDaov1Impl implements ProductDaov1{
	
	
	static HashMap<Integer, Productv1> productIdMap = ProductDBv1.getProductIdMap();

	@Override
	public List<Productv1> getAllProducts() {
		// TODO Auto-generated method stub
		List<Productv1> Products = new ArrayList<Productv1>(productIdMap.values());
		return Products;
	}

	@Override
	public Productv1 addProduct(Productv1 product) {
		// TODO Auto-generated method stub
		productIdMap.put(product.getId(),product);
		return product;
	}

	@Override
	public Productv1 updateProduct(Productv1 product) {
		// TODO Auto-generated method stub
		if (product.getId() <=0)
		return null;
		productIdMap.put(product.getId(), product);
		return product;
	}

	 

	@Override
	public Productv1 deleteProduct (int id) {
		// TODO Auto-generated method stub
		return productIdMap.remove(id);
	}

	

	 

}