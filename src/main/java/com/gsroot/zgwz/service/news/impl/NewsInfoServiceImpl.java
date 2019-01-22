/*
 * Copyright (c) 2018-2028 甘肃根目录网络科技有限公司 All Rights Reserved.
 * ProjectName: zgwz
 */

package com.gsroot.zgwz.service.news.impl;

import com.gsroot.zgwz.mapper.news.NewsInfoDao;
import com.gsroot.zgwz.model.news.NewsInfoEntity;
import com.gsroot.zgwz.service.news.NewsInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author panzc
 * @Title: NewsInfoServiceImpl
 * @ProjectName zgwz
 * @Description: TODO 新闻业务处理类
 * @date 2019/1/10 0010下午 2:34
 */

@Service(value = "newsInfoService")
public class NewsInfoServiceImpl implements NewsInfoService {

    private NewsInfoDao newsInfoDao;

    @Override
    public void insertNews(NewsInfoEntity newsInfoEntity) {
        newsInfoDao.insertNews(newsInfoEntity);
    }

    @Override
    public void deleteNews(int id) {

        newsInfoDao.deleteNews(id);
    }

    @Override
    public List<NewsInfoEntity> getAllNews(int pageSize, int start) {
        return newsInfoDao.getAllNews(pageSize,start);
    }

    @Override
    public Integer getAllNewsSize(int pageSize, int start) {
        return newsInfoDao.newsSize(pageSize,start);
    }

    @Override
    public List<NewsInfoEntity> getTopNews(int pageSize, int start) {
        return newsInfoDao.getTopNews(pageSize,start);
    }

    @Override
    public NewsInfoEntity getNews(int id) {
        return newsInfoDao.getNews(id);
    }

    @Override
    public void updateNews(NewsInfoEntity newsInfoEntity) {

        newsInfoDao.updateNews(newsInfoEntity);
    }
}
