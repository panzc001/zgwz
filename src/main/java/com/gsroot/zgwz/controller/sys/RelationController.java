/*
 * Copyright (c) 2018-2028 甘肃根目录网络科技有限公司 All Rights Reserved.
 * ProjectName: zgwz
 */

package com.gsroot.zgwz.controller.sys;

import com.gsroot.zgwz.model.sys.RelationEntity;
import com.gsroot.zgwz.service.sys.RelationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class RelationController {

	private Logger log = LoggerFactory.getLogger(RelationController.class);

	@Resource(name = "relationServiceImpl")
	private RelationService relationService;

	/**
	 * 通过userId得到关系List
	 * @param userId
	 * @return
	 */
	@GetMapping("/relations/{userId}")
	public List<RelationEntity> getRelationByUserId(@PathVariable int userId){
		log.debug("The method is ending");
		return relationService.getRelationByUserId(userId);
	}
	
	/**
	 * 批量插入关系数据
	 * @param relationList
	 * @return
	 */
	@PostMapping("/relations")
	public List<RelationEntity> insertRelations(@RequestBody() List<RelationEntity> relationList){
		relationService.insertRelations(relationList);
		log.debug("The method is ending");
		return relationList;
	}
}
