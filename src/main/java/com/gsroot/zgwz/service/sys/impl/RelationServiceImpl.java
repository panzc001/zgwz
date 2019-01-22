/*
 * Copyright (c) 2018-2028 甘肃根目录网络科技有限公司 All Rights Reserved.
 * ProjectName: zgwz
 */

package com.gsroot.zgwz.service.sys.impl;

import com.gsroot.zgwz.mapper.sys.RelationDao;
import com.gsroot.zgwz.model.sys.RelationEntity;
import com.gsroot.zgwz.service.sys.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "relationServiceImpl")
public class RelationServiceImpl implements RelationService {

	@Autowired
	private RelationDao relationDao;

	@Override
	public List<RelationEntity> getRelationByUserId(int userId) {
		return relationDao.getRelationByUserId(userId);
	}

	@Transactional
	@Override
	public void insertRelations(List<RelationEntity> relationList) {
		relationDao.delById(relationList.get(0).getUserId());
		if (relationList.get(0).getRoleId() != null) {
			relationDao.insertRelations(relationList);
		}
	}

}
