/*
 * Copyright (c) 2018-2028 甘肃根目录网络科技有限公司 All Rights Reserved.
 * ProjectName: zgwz
 */

package com.gsroot.zgwz.model.sys;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author panzc
 * @Description //TODO
 * @Date 上午 10:27 2019/1/9 0009
 * @Param
 * @Version 1.0.0
 **/
@Data
@NoArgsConstructor
public class MenuEntity {
	/**
	 * id
	 */
	private int id;
	/**
	 * 菜单名
	 */
	private String name;
	/**
	 * url
	 */
	private String url;
	/**
	 * 父类id
	 */
	private int parentId;
	/**
	 * 排序
	 */
	private int sort;
	/**
	 * 描述
	 */
	private String remark;
	/**
	 * 图标
	 */
	private String icon;
	/**
	 * 二级菜单
	 */
	List<MenuEntity> children;


	@Override
	public String toString() {
		return "MenuEntity [id=" + id + ", name=" + name + ", url=" + url + ", parentId=" + parentId + ", sort=" + sort
				+ ", remark=" + remark + ", icon=" + icon + ", children=" + children + "]";
	}

}
