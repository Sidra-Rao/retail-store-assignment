package com.retail.dao;

import com.retail.model.Discount;

public interface DiscsountDAO {
     
   public Discount getDiscountPercentageByUserType(String userType);
}