package com.retail.dao;

import java.util.List;

import com.retail.model.ShoppingCart;

public interface ShoppingCartDAO {
     
    public List<ShoppingCart> getAllProductsByUserId(Integer id);    
}