package com.cg.iter.controller;

import java.util.List;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iter.entity.Product;
import com.cg.iter.entity.Productv1;
import com.cg.iter.exceptions.IdNotFoundException;
import com.cg.iter.service.ProductService;
import com.cg.iter.service.ProductServicev1;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductService service;
	
	@Autowired
	ProductServicev1 servicev1;

	// Create product
	@PostMapping("/addproduct")
	public String productCreation(@RequestBody Product emp) {
		Product e = service.insertProduct(emp);
		
			return "product added successfully";
		
	}

	// Get Particular product Data
	@GetMapping("/getproduct/{id}")
	@ResponseBody
	private Product getProduct(@PathVariable("id") int id) {
		Product e = service.getProductById(id);
			return e;
		
	}

	// Get All products Data
	@GetMapping("/allproducts")
	@ResponseBody
	private List<Product> getAllProducts() {
		List<Product> prodlist = service.getAllProducts();
		return (prodlist);

	}

	// Updating product data
	@PutMapping("/updateproduct")
	@ResponseBody
	public String updateProduct(@RequestBody Product p) {
		Product e = service.updateProduct(p);
		
			return ("product updated successfully");
	
	}

	// Deleting product
	@DeleteMapping("/deleteproduct/{id}")
	@ResponseBody
	private String deleteProduct(@PathVariable("id") int id) {
		service.deleteProduct(id);
	
			return "Product deleted successfully";
		
	}
	@PostMapping("/addproductv1")
	public String productCreationv1(@RequestBody Productv1 emp) {
		Productv1 e = servicev1.insertProduct(emp);
		
			return "product added successfully";
		
	}

	// Get Particular product Data
	@GetMapping("/getproductv1/{id}")
	@ResponseBody
	private Productv1 getProductv1(@PathVariable("id") int id) {
		Productv1 e = servicev1.getProductById(id);
			return e;
		
	}

	// Get All products Data
	@GetMapping("/allproductsv1")
	@ResponseBody
	private List<Productv1> getAllProductsv1() {
		List<Productv1> prodlist = servicev1.getAllProducts();
		return (prodlist);

	}

	@PutMapping("/updateproductv1")
	@ResponseBody
	public String updateProductv1(@RequestBody Productv1 p) {
		Productv1 e = servicev1.updateProduct(p);
		
			return ("product updated successfully");
	
	}

	// Deleting product
	@DeleteMapping("/deleteproductv1/{id}")
	@ResponseBody
	private String deleteProductv1(@PathVariable("id") int id) {
		servicev1.deleteProduct(id);
	
			return "Product deleted successfully";
		
	}

	@ExceptionHandler(IdNotFoundException.class)
	@ResponseBody
	public String userNotFound(IdNotFoundException e) {
		return (e.getMessage());
	}
}
