package com.retail.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.model.User;
import com.retail.repository.UserRepository;

@Service
public class UserDAOImpl implements UserDAO {
	
	  @Autowired
	    private UserRepository repository;
	     
	    public List<User> listAllUsers() {
	        return repository.findAll();
	    }
	     
	    public User getUser(Integer id) {
	        return repository.findById(id).get();
	    }  
}
