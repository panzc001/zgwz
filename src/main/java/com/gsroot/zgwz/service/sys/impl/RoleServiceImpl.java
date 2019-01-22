/*
 * Copyright (c) 2018-2028 甘肃根目录网络科技有限公司 All Rights Reserved.
 * ProjectName: zgwz
 */

package com.gsroot.zgwz.service.sys.impl;


import com.gsroot.zgwz.mapper.sys.RoleDao;
import com.gsroot.zgwz.model.sys.RoleEntity;
import com.gsroot.zgwz.service.sys.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "roleServiceImpl")
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;

	@Override
	public List<RoleEntity> rolesList(int pageSize, int start) {
		return roleDao.rolesList(pageSize, start);
	}

	@Override
	public Integer rolesSize(int pageSize, int start) {
		return roleDao.rolesSize(pageSize, start);
	}

	@Override
	public void insertRole(RoleEntity roleEntity) {
		roleDao.insertRole(roleEntity);
	}

	@Override
	public void updateRole(RoleEntity roleEntity) {
		roleDao.updateRole(roleEntity);
	}

	@Override
	public void deleteRoles(List<String> groupId) {
		roleDao.deleteRoles(groupId);
	}

	@Override
	public List<RoleEntity> allRoles() {
		return roleDao.allRoles();
	}

}
