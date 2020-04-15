package com.retail.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.retail.model.ProductType;

@Repository
public interface ProductTypeRepository extends JpaRepositoryImplementation<ProductType, Integer>{
}
