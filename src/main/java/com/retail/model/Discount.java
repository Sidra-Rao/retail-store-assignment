package com.retail.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="discounts")
@Access(value=AccessType.PROPERTY)
public class Discount extends BaseModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "discount_type")
	private String discountType;
	@Column(name = "discount_percentage")
	private Integer discountPercentage;
	
	
	public String getDiscountType() {
		return discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	public Integer getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(Integer discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	@Override
	public String toString() {
		return "Discount [discountType=" + discountType + ", discountPercentage=" + discountPercentage + "]";
	}
	
	
}
