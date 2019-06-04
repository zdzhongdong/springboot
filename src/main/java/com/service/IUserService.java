package com.service;

import java.util.List;

import com.entity.User;

public interface IUserService {
	 public List<User> getList();
	 
	 public void addUser(User u);
}
