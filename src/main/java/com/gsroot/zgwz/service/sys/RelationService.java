/*
 * Copyright (c) 2018-2028 甘肃根目录网络科技有限公司 All Rights Reserved.
 * ProjectName: zgwz
 */

package com.gsroot.zgwz.service.sys;


import com.gsroot.zgwz.model.sys.RelationEntity;

import java.util.List;

public interface RelationService {

	/**
	 * 通过userId得到关系List
	 * @param userId
	 * @return
	 */
	public List<RelationEntity> getRelationByUserId(int userId);

	/**
	 * 批量插入关系数据
	 * @param relationList
	 */
	public void insertRelations(List<RelationEntity> relationList);

	
}
