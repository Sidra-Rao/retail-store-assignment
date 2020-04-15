package com.retail.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.retail.model.Product;

@Repository
public interface ProductRepository extends JpaRepositoryImplementation<Product, Integer>{
}
