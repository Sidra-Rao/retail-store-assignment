package com.retail.service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.dao.DiscsountDAO;
import com.retail.dao.ProductDAO;
import com.retail.dao.ProductTypeDAO;
import com.retail.dao.ShoppingCartDAO;
import com.retail.dao.UserTypeDAO;
import com.retail.model.Discount;
import com.retail.model.Product;
import com.retail.model.ProductType;
import com.retail.model.ShoppingCart;
import com.retail.model.User;
import com.retail.model.UserType;
import com.retailer.utility.CustomerTypeEnum;
import com.retailer.utility.DiscountTypeEnum;
import com.retailer.utility.ProductTypeEnum;
@Service
public class RetailerServiceImpl implements RetailerService {
	
	  @Autowired
	  private ProductDAO productDAO;
	  
	  @Autowired
	  private ProductTypeDAO productTypeDAO;
	  
	  @Autowired
	  private UserTypeDAO userTypeDAO;
	  
	  @Autowired
	  private ShoppingCartDAO shoppingCartDAO;
	  
	  @Autowired
	  private DiscsountDAO discsountDAO;	  
	     
	  
	  @Override
	  public void generateInvoice(User user) {
		  
		  UserType userType= userTypeDAO.getUserType(user.getUserTypeId());
		  System.out.println("");
		  System.out.println("__________________________________________________________________");
		  System.out.println("Generating Customer Invoice with name: "+user.getUserName());
		  System.out.println("Type: "+userType.getUserType());
		  
		  List<ShoppingCart> items = shoppingCartDAO.getAllProductsByUserId(user.getId());
		  Double discountedAmount = 00.00;
		  Double amount = 00.00;
		  
		  System.out.println("Total Items Count "+items.size());
				  
		  for(ShoppingCart item: items){
			  Product product = productDAO.get(item.getProductId());
			  ProductType type = productTypeDAO.getProductTypeById(product.getProductTypeId());
			  if(ProductTypeEnum.Grocery.equals(type.getProductType())){
				  amount = amount+ (item.getQuantity()*product.getPrice());
				  System.out.println(product.getProductName()+" : "+type.getProductType() +" : "+amount);
			  }else{
				  discountedAmount = discountedAmount+ (item.getQuantity()*product.getPrice());
				  System.out.println(product.getProductName()+" : "+type.getProductType() +" : "+discountedAmount);
			  }			  
		  }		  
		  
		  Integer discPercent = 0;
		  if(CustomerTypeEnum.EMPLOYEE.toString().equals(userType.getUserType())){
			  discPercent =  this.getDiscountPercentage(DiscountTypeEnum.EMPLOYEE);
			  discountedAmount = discountedAmount*discPercent/100;
			  amount = discountedAmount +amount;
		  }
		  else if(CustomerTypeEnum.AFFILIATE.toString().equals(userType.getUserType())){
			  discPercent =  this.getDiscountPercentage(DiscountTypeEnum.AFFILIATE);
			  discountedAmount = discountedAmount*discPercent/100;
			  amount = discountedAmount +amount;
		  }
		  else if(CustomerTypeEnum.CUSTOMER.toString().equals(userType.getUserType())){
			  if(isOldCustomer(user.getCreatedOn())){
				  discPercent =  this.getDiscountPercentage(DiscountTypeEnum.OLD_CUSTOMER);
				  discountedAmount = discountedAmount*discPercent/100;
				  amount = discountedAmount +amount;
			  }else{
				  discPercent =  this.getDiscountPercentage(DiscountTypeEnum.EVERY_100);
				  amount = discountedAmount+amount;
				  Integer total = (int) (amount/100);
				  if( amount/100 > 0){
					  amount = amount - (total*discPercent);
				  }
			  }
		  }
			
		  System.out.println("Total amount : "+ amount);		 
		  System.out.println("__________________________________________________________________");
		  System.out.println("");
	 }

	 
	 private Integer getDiscountPercentage(DiscountTypeEnum type) {		 
		 Discount discount = discsountDAO.getDiscountPercentageByUserType(type.toString());
		 return discount.getDiscountPercentage();		
	 }
	 
	 private boolean isOldCustomer(Timestamp date){		 
		LocalDate createdDate = date.toLocalDateTime().toLocalDate();		 
		Period p = Period.between(createdDate, LocalDate.now());
		int years = p.getYears(); 
		return years <2 ? false : true;		 
	 }

}
