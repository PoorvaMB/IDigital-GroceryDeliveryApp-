package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.capg.dao.ProductDao;

import com.capg.exception.ResourceNotFoundException;
import com.capg.model.Product;

@Transactional
@Component
public class ProductServiceImpl  implements ProductService{
	
	 @Autowired
	 private ProductDao productDao;

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.save(product);
	}

//	@Override
//	public List<Product> findAllProducts() {
//		// TODO Auto-generated method stub
//		return productDao.findAll();
	
	@Override
	public List<Product> findAllProducts() throws ResourceNotFoundException {
		List<Product> product = (List<Product>) productDao.findAll();
		if (product == null)
			throw new ResourceNotFoundException("Product not created");
		return product;
	}

//	@Override
//	public Product findProductById(long id) {
//		// TODO Auto-generated method stub
//		return productDao.findById(id).orElse(null);
	
	@Override
	public Product findProductById(long id) throws ResourceNotFoundException {

		if (productDao.findById(id).isPresent()) {
			Product product = productDao.findById(id).get();
			return product;
		} else {
			throw new ResourceNotFoundException("Product with Id: " + id + " doesn't exist!!");
		}
	}



	}	


