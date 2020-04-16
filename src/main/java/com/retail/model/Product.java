package com.retail.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="product")
@Access(value=AccessType.PROPERTY)
public class Product extends BaseModel {

	@Column(name = "product_type_id")
	private Integer productTypeId;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "price")
	private Double price;
	
	
	public Integer getProductTypeId() {
		return productTypeId;
	}
	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [productTypeId=" + productTypeId + ", productName=" + productName + ", price=" + price + "]";
	}
	
	
}
