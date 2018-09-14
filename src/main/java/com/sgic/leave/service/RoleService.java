package com.sgic.leave.service;

import com.sgic.leave.entity.Role;

public interface RoleService {
	boolean addRole(Role role);
	Iterable<Role> viewRole();
	boolean updadeRole(Role role);
	boolean deleteRole(Role role);

}
