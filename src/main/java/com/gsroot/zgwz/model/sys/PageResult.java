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
 * @Date 上午 10:28 2019/1/9 0009
 * @Param
 * @Version 1.0.0
 **/
@Data
@NoArgsConstructor
public class PageResult {
	private List<?> data;

	private Integer totalCount;
	@Override
	public String toString() {
		return "PageResult [data=" + data + ", totalCount=" + totalCount + "]";
	}
}
