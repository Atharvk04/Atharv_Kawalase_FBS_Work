package com.shop.dao;

import java.util.List;

import com.shop.model.User;

public interface UserDao 
{
	User login(String email,String password);
	boolean registerUser(User user);
	public List<User> getAllUsers();
}
