package com.retail.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="user_type")
@Access(value=AccessType.PROPERTY)
public class UserType extends BaseModel {

	@Column(name = "user_type")
	private String userType;

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	@Override
	public String toString() {
		return "UserType [userType=" + userType + "]";
	}
	
	
}
