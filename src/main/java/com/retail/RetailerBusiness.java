package com.retail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.retail.model.User;
import com.retail.service.RetailerService;

@Component
public class RetailerBusiness {
	@Autowired
	private RetailerService service;	
	
	public void generateInvoice(User user){
		service.generateInvoice(user);
	}
  
}
