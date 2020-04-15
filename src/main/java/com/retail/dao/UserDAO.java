package com.retail.dao;

import java.util.List;

import com.retail.model.User;

public interface UserDAO {
     
    public List<User> listAllUsers();
    
    public User getUser(Integer id);     
}