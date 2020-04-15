package com.retail;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.retail.dao.UserDAO;
import com.retail.model.User;
import com.retail.service.RetailerService;



@SpringBootTest
public class RetailerBusinessTest {
	
	@Autowired
	RetailerService service;
	
	@Autowired
	private UserDAO user;
	
	@Autowired
	RetailerBusiness business;
	  
	 

	@Test
    public void IsAffiliateCustomer(){		
		business.generateInvoice(this.affilateMock());
        assertThat(business).isNotNull();
        
        assertThat(this.affilateMock().getUserName()).isNotNull();
        assertEquals(this.affilateMock().getUserTypeId(), 3);     
    }
	
	@Test
    public void IsEmployeeCustomer(){		
		business.generateInvoice(this.affilateMock());
        assertThat(business).isNotNull();
        
        assertThat(this.employeeMock().getUserName()).isNotNull();
        assertEquals(this.employeeMock().getUserTypeId(), 1);     
    }
	
	@Test
    public void IsNewCustomer(){		
		business.generateInvoice(this.affilateMock());
        assertThat(business).isNotNull();
        
        assertThat(this.newCustomerMock().getUserName()).isNotNull();
        assertEquals(this.newCustomerMock().getUserTypeId(), 2);     
    }
	
	@Test
    public void IsOldCustomer(){		
		business.generateInvoice(this.affilateMock());
        assertThat(business).isNotNull();
        
        assertThat(this.oldCustomerMock().getUserName()).isNotNull();
        assertEquals(this.oldCustomerMock().getUserTypeId(), 2);    
    }
	
	   private User employeeMock(){
			return user.getUser(1);  
	    }
	  
	    private User affilateMock(){
			return user.getUser(3);  
	    }
	   
	   private User oldCustomerMock(){
			return user.getUser(4);  
	    }
	  
	    private User newCustomerMock(){
			return user.getUser(2);  
	    }
}
