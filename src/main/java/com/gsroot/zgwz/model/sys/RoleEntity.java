/*
 * Copyright (c) 2018-2028 甘肃根目录网络科技有限公司 All Rights Reserved.
 * ProjectName: zgwz
 */

package com.gsroot.zgwz.model.sys;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author panzc
 * @Description //TODO
 * @Date 上午 10:26 2019/1/9 0009
 * @Param
 * @Version 1.0.0
 **/
@Data
@NoArgsConstructor
public class RoleEntity {
	/**
	 * id
	 */
	private int id;
	/**
	 * 角色
	 */
	private String role;
	/**
	 * 角色名称
	 */
	private String name;
	/**
	 * 权限
	 */
	private String modules;
	/**
	 * 描述
	 */
	private String describe;

}
