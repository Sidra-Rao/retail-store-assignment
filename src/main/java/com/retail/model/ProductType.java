package com.retail.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="product_type")
@Access(value=AccessType.PROPERTY)
public class ProductType extends BaseModel {
	
	@Column(name = "product_type")
	private String productType;

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	@Override
	public String toString() {
		return "ProductType [productType=" + productType + "]";
	}
	
	
}
