package com.retail.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.model.Discount;
import com.retail.repository.DiscountRepository;

@Service
public class DiscountDAOImpl implements DiscsountDAO {
	
	  @Autowired
	    private DiscountRepository repository;	     
	     
	    public Discount getDiscountPercentageByUserType(String userType) {
	        return repository.findByDiscountType(userType);
	    }
}
