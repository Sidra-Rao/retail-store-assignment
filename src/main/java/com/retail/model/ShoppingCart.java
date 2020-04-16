package com.retail.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="shopping_cart")
@Access(value=AccessType.PROPERTY)
public class ShoppingCart extends BaseModel {

	@Column(name = "product_id")
	private Integer productId;
	@Column(name = "user_id")
	private Integer userId;
	@Column(name = "quantity")
	private Integer quantity;
	
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "ShoppingCart [productId=" + productId + ", userId=" + userId + ", quantity=" + quantity + "]";
	}
	
	
}
