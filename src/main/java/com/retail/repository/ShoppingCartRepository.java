package com.retail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.retail.model.ShoppingCart;

@Repository
public interface ShoppingCartRepository extends JpaRepositoryImplementation<ShoppingCart, Integer>{
	
	public List<ShoppingCart> findAllByUserId(Integer id);
}
