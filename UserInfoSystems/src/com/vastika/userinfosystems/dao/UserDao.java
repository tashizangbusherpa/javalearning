package com.vastika.userinfosystems.dao;

import java.util.List;

import com.vastika.userinfosystems.model.User;


public interface UserDao {

	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUser(int id);
	
	User getUserInfoById(int id);
	
	List<User> getAllUserInfo();
}
