/*
 * Copyright (c) 2018-2028 甘肃根目录网络科技有限公司 All Rights Reserved.
 * ProjectName: zgwz
 */

package com.gsroot.zgwz.mapper.sys;


import com.gsroot.zgwz.model.sys.RelationEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RelationDao {

	/**
	 * 通过userId得到关系List
	 * 
	 * @param userId
	 * @return
	 */
	public List<RelationEntity> getRelationByUserId(@Param("userId") int userId);

	/**
	 * 通过userId删除关系
	 * 
	 * @param userId
	 */
	public void delById(@Param("userId") int userId);

	/**
	 * 批量插入关系数据
	 * 
	 * @param relationList
	 */
	public void insertRelations(List<RelationEntity> relationList);
}
