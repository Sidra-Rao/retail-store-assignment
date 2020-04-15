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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((discountPercentage == null) ? 0 : discountPercentage.hashCode());
		result = prime * result + ((discountType == null) ? 0 : discountType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Discount other = (Discount) obj;
		if (discountPercentage == null) {
			if (other.discountPercentage != null)
				return false;
		} else if (!discountPercentage.equals(other.discountPercentage))
			return false;
		if (discountType == null) {
			if (other.discountType != null)
				return false;
		} else if (!discountType.equals(other.discountType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Discount [discountType=" + discountType + ", discountPercentage=" + discountPercentage + "]";
	}
	
	
}
