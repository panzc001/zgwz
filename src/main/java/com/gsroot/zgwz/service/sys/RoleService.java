/*
 * Copyright (c) 2018-2028 甘肃根目录网络科技有限公司 All Rights Reserved.
 * ProjectName: zgwz
 */

package com.gsroot.zgwz.service.sys;


import com.gsroot.zgwz.model.sys.RoleEntity;

import java.util.List;

public interface RoleService {

	/**
	 * 获取role列表
	 * 
	 * @param pageSize
	 * @param page
	 * @return
	 */
	public List<RoleEntity> rolesList(int pageSize, int start);

	/**
	 * 获取role列表的总量
	 * 
	 * @param pageSize
	 * @param page
	 * @return
	 */
	public Integer rolesSize(int pageSize, int start);

	/**
	 * 新建角色信息
	 * 
	 * @param roleEntity
	 */
	public void insertRole(RoleEntity roleEntity);

	/**
	 * 更新角色信息
	 * 
	 * @param roleEntity
	 */
	public void updateRole(RoleEntity roleEntity);

	/**
	 * 删除角色信息
	 * 
	 * @param groupId
	 */
	public void deleteRoles(List<String> groupId);

	/**
	 * 得到角色全部数据
	 * @return
	 */
	public List<RoleEntity> allRoles();
}
