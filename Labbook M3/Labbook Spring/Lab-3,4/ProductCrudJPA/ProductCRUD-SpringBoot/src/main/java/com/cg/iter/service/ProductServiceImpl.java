package com.cg.iter.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iter.dao.ProductDao;
import com.cg.iter.entity.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService 
{
	@Autowired
	private ProductDao dao;

	@Override
	public Product insertProduct(Product p) {
		return dao.addProduct(p);
	}

	
	@Override
	public Product getProductById(int id) 
	{
		List<Product> productList=dao.getAllProducts();
		for (Product product : productList) {
			if(product.getId()==id) {
				return product;
			}
		}
		return null;
	}

	@Override
	public List<Product> getAllProducts() 
	{
		return dao.getAllProducts();
	}

	@Override
	public void deleteProduct(int id) 
	{
		dao.deleteProduct(id);
	}
	@Override
	public Product updateProduct(Product p) {
		return dao.updateProduct(p);
	}

}