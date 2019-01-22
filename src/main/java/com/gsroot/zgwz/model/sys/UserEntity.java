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
 * @Date 上午 10:25 2019/1/9 0009
 * @Param
 * @Version 1.0.0
 **/
@Data
@NoArgsConstructor
public class UserEntity {
	/**
	 * id
	 */
	private int id;
	/**
	 * 姓名
	 */
	private String loginName;
	/**
	 * 登录名
	 */
	private String name;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 邮箱
	 */
	private String email;


	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", loginName=" + loginName + ", name=" + name + ", password=" + password
				+ ", email=" + email + "]";
	}

}
