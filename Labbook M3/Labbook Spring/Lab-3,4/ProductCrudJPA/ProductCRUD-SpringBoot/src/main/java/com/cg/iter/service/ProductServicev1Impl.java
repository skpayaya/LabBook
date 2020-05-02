package com.cg.iter.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iter.dao.ProductDao;
import com.cg.iter.dao.ProductDaov1;
import com.cg.iter.entity.Product;
import com.cg.iter.entity.Productv1;

@Service
@Transactional
public class ProductServicev1Impl implements ProductServicev1
{
	@Autowired
	private ProductDaov1 dao;

	@Override
	public Productv1 insertProduct(Productv1 p) {
		return dao.addProduct(p);
	}

	
	@Override
	public Productv1 getProductById(int id) 
	{
		List<Productv1> productList=dao.getAllProducts();
		for (Productv1 product : productList) {
			if(product.getId()==id) {
				return product;
			}
		}
		return null;
	}

	@Override
	public List<Productv1> getAllProducts() 
	{
		return dao.getAllProducts();
	}

	@Override
	public void deleteProduct(int id) 
	{
		dao.deleteProduct(id);
	}
	@Override
	public Productv1 updateProduct(Productv1 p) {
		return dao.updateProduct(p);
	}

}