package com.retail.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.retail.model.UserType;

@Repository
public interface UserTypeRepository extends JpaRepositoryImplementation<UserType, Integer>{
}
