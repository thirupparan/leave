package com.sgic.leave.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.leave.entity.User;
import com.sgic.leave.entity.UserRepository;

@Service

public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository  userReposit;

	@Override
	public boolean addUser(User user) {
		userReposit.save(user);
		return true;
	}

	@Override
	public Iterable<User> viewUser() {
		// TODO Auto-generated method stub
		return userReposit.findAll();
	}

	@Override
	public boolean updateUser(User user) {
		int userId =user.getId();
		boolean isExist = userReposit.findById(userId) != null;
		if(isExist) {
			userReposit.save(user);
		}
		return isExist;
	}

	@Override
	public boolean deleteUser(User user) {
		int userId = user.getId();
		boolean isExist = userReposit.findById(userId) != null;
		if (isExist) {
			userReposit.save(user);
		}
		return isExist;
	}

}
