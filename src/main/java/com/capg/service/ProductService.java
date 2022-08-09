package com.capg.service;

import java.util.List;

import com.capg.exception.ResourceNotFoundException;
import com.capg.model.Product;

public interface ProductService {
	
	Product addProduct(Product product);
	
    //Product editProduct(Product product, long id);
	
	Product findProductById(long id) throws ResourceNotFoundException;
	
	//void deleteProduct(long id);
	
	List<Product> findAllProducts() throws ResourceNotFoundException ;

	

	
}
