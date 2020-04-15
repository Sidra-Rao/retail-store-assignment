package com.retail.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.model.ShoppingCart;
import com.retail.repository.ShoppingCartRepository;

@Service
public class ShoppingCartDAOImpl implements ShoppingCartDAO {
	
	  @Autowired
	    private ShoppingCartRepository repository;
	     
	    public List<ShoppingCart> getAllProductsByUserId(Integer id) {
	        return repository.findAllByUserId(id);
	    }	     
	    
}
