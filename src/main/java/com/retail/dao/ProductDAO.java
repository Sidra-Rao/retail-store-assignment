package com.retail.dao;

import java.util.List;

import com.retail.model.Product;

public interface ProductDAO {
     
    public List<Product> listAll();
     
    public void save(Product product);
     
    public Product get(Integer id);
     
    public void delete(Integer id);
}