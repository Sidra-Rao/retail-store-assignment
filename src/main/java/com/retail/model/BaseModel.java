package com.retail.model;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseModel{
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "is_active")
	private Boolean isActive;
	@Column(name = "created_on")
	private Timestamp createdOn;
	@Column(name = "updated_on")
	private Timestamp updateOn;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Timestamp getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}
	public Timestamp getUpdateOn() {
		return updateOn;
	}
	public void setUpdateOn(Timestamp updateOn) {
		this.updateOn = updateOn;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
		result = prime * result + ((updateOn == null) ? 0 : updateOn.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseModel other = (BaseModel) obj;
		if (createdOn == null) {
			if (other.createdOn != null)
				return false;
		} else if (!createdOn.equals(other.createdOn))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isActive == null) {
			if (other.isActive != null)
				return false;
		} else if (!isActive.equals(other.isActive))
			return false;
		if (updateOn == null) {
			if (other.updateOn != null)
				return false;
		} else if (!updateOn.equals(other.updateOn))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BaseModel [id=" + id + ", isActive=" + isActive + ", createdOn=" + createdOn + ", updateOn=" + updateOn
				+ "]";
	}
	
	
}
