package com.retail.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.model.UserType;
import com.retail.repository.UserTypeRepository;

@Service
public class UserTypeDAOImpl implements UserTypeDAO {
	
	  @Autowired
	    private UserTypeRepository repository;     
	   
	     
	    public UserType getUserType(Integer id) {
	        return repository.findById(id).get();
	    }  
}
