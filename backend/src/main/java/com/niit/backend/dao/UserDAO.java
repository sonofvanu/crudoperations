package com.niit.backend.dao;

import java.util.List;

import com.niit.backend.model.UserModel;

public interface UserDAO {
	public boolean inserttUser(UserModel userModel);
	
	public List<UserModel> listOfUsers();
	
	public UserModel singleUser(String userEmail);
	
	public boolean deleteUser(UserModel userModel);

}
