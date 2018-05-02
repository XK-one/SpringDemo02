package com.wyk.spring.manager.impl;

import com.wyk.spring.manager.UserManager;

public class UserManagerImpl implements UserManager {

	@Override
	public void addUser(String name, String password) {
		System.out.println("add user: " + name);
	}

	@Override
	public void delUser(int userId) {
		System.out.println("del user: " + userId);

	}

	@Override
	public String findUserById(int userId) {
		System.out.println("find user: " + userId); 
		return "LISI";
	}

	@Override
	public void modifyUser(int userId, String username, String password) {
		System.out.println("修改用户id ： " + userId + ",修改成" + username); 
	}

}
