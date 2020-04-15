package com.retail.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.model.Product;
import com.retail.repository.ProductRepository;

@Service
public class ProductDAOImpl implements ProductDAO {
	
	  @Autowired
	    private ProductRepository productRepository;
	     
	    public List<Product> listAll() {
	        return productRepository.findAll();
	    }
	     
	    public void save(Product product) {
	    	productRepository.save(product);
	    }
	     
	    public Product get(Integer id) {
	        return productRepository.findById(id).get();
	    }
	     
	    public void delete(Integer id) {
	    	productRepository.deleteById(id);
	    }
}
