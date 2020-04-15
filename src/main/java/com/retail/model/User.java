package com.retail.model;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="user")
@Access(value=AccessType.PROPERTY)
public class User extends BaseModel {

	@Column(name = "user_name")
	private String userName;
	@Column(name = "user_type_id")
	private Integer userTypeId;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(Integer userTypeId) {
		this.userTypeId = userTypeId;
	}
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userTypeId=" + userTypeId + "]";
	}
		
	
}
