package com.sgic.leave.service;

import com.sgic.leave.entity.User;

public interface UserService {
boolean addUser(User user);
Iterable<User> viewUser();
boolean updateUser (User user);
boolean deleteUser (User user);
}
