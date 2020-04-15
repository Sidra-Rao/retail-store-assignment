package com.retail.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.model.ProductType;
import com.retail.repository.ProductTypeRepository;

@Service
public class ProductTypeDAOImpl implements ProductTypeDAO {
	
	@Autowired
    private ProductTypeRepository repository;  
    
     
    public ProductType getProductTypeById(Integer id) {
        return repository.findById(id).get();
    }
    
}
