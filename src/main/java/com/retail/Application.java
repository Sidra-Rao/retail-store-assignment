package com.retail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.retail.dao.UserDAO;
import com.retail.model.User;



@EnableAutoConfiguration
@EntityScan("com.retail.model")
@EnableJpaRepositories
@ComponentScan("com.retail")
@SpringBootApplication(scanBasePackages = {"com.retail", "com.retail.repository","com.retail.dao","com.retail.service", "com.retail.model" })
public class Application  implements CommandLineRunner{
	
	@Autowired
	private UserDAO userDao;
	@Autowired
	RetailerBusiness business;
	
	
	 public static void main(String[] args) {
	  SpringApplication.run(Application.class, args);
	}
	
	@Override
    public void run(String... args) {

      // business = new RetailerBusiness();
       business.generateInvoice(this.employeeMock());
       
       business.generateInvoice(this.affilateMock());
       
       business.generateInvoice(this.newCustomerMock());
       
       business.generateInvoice(this.oldCustomerMock());

    }
	
	  private User employeeMock(){
			return userDao.getUser(1);  
	    }
	  
	    private User affilateMock(){
			return userDao.getUser(3);  
	    }
	   
	    private User oldCustomerMock(){
			return userDao.getUser(4);  
	    }
	  
	    private User newCustomerMock(){
			return userDao.getUser(2);  
	    }

}
