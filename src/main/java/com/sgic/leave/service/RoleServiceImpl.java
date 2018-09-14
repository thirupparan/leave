package com.sgic.leave.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.leave.entity.Role;
import com.sgic.leave.entity.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleRepository roleReposit;

	@Override
	public boolean addRole(Role role) {
		roleReposit.save(role);
		return true;
	}

	@Override
	public boolean updadeRole(Role role) {
		// TODO Auto-generated method stub
		
		int roleId = role.getId();
		boolean isExist = roleReposit.findById(roleId) != null;
		if(isExist) {
			roleReposit.save(role);
		}
		return isExist;
	}

	@Override
	public boolean deleteRole(Role role) {
		// TODO Auto-generated method stub
		int roleID = role.getId();
		boolean isExist = roleReposit.findById(roleID) != null;
		if(isExist) {
			roleReposit.delete(role);
		}
		return isExist;
	}

	@Override
	public Iterable<Role> viewRole() {
		return roleReposit.findAll();
	}
}
