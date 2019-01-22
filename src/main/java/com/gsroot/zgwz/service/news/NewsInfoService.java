/*
 * Copyright (c) 2018-2028 甘肃根目录网络科技有限公司 All Rights Reserved.
 * ProjectName: zgwz
 */

package com.gsroot.zgwz.service.news;

import com.gsroot.zgwz.model.news.NewsInfoEntity;

import java.util.List;

/**
 * @author panzc
 * @Title: NewsInfoService
 * @ProjectName zgwz
 * @Description: TODO
 * @date 2019/1/10 0010上午 10:55
 */
public interface NewsInfoService {

    public void insertNews(NewsInfoEntity newsInfoEntity);

    public void deleteNews(int id);

    public List<NewsInfoEntity> getAllNews(int pageSize, int start);

    public Integer getAllNewsSize(int pageSize, int start);

    public List<NewsInfoEntity> getTopNews(int pageSize, int start);

    public NewsInfoEntity getNews(int id);

    public void updateNews(NewsInfoEntity newsInfoEntity);
}
