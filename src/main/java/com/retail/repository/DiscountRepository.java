package com.retail.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.retail.model.Discount;

@Repository
public interface DiscountRepository extends JpaRepositoryImplementation<Discount, Integer>{
	public Discount findByDiscountType(String userType);
}
