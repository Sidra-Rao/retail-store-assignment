package com.retail.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.retail.model.User;

@Repository
public interface UserRepository extends JpaRepositoryImplementation<User, Integer>{
}
