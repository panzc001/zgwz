/*
 * Copyright (c) 2018-2028 甘肃根目录网络科技有限公司 All Rights Reserved.
 * ProjectName: zgwz
 */

package com.gsroot.zgwz.controller.news;

import com.gsroot.zgwz.model.news.NewsInfoEntity;
import com.gsroot.zgwz.model.sys.PageResult;
import com.gsroot.zgwz.service.news.NewsInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author panzc
 * @Title: NewsInfoController
 * @ProjectName zgwz
 * @Description: TODO
 * @date 2019/1/10 0010下午 2:47
 */
@RestController
public class NewsInfoController {

    @Resource(name="newsInfoService")
    private NewsInfoService newsInfoService;

    /**
     * @Author panzc
     * @Description //TODO
     * @Date 下午 3:04 2019/1/10 0010
     * @Param  获取新闻列表
     * @Version 1.0.0
     **/
    @GetMapping("/news")
    public PageResult newsList(int pageSize, int page){

        PageResult pageResult = new PageResult();
        pageResult.setData(newsInfoService.getAllNews(pageSize,pageSize*page));
        pageResult.setTotalCount(newsInfoService.getAllNewsSize(pageSize,page));
        return pageResult;

    }

    /**
     * @Author panzc
     * @Description //TODO
     * @Date 下午 4:27 2019/1/10 0010
     * @Param 插入新闻
     * @Version 1.0.0
     **/
    @PostMapping("/news/insertNews")
    public NewsInfoEntity insertNews(@RequestBody NewsInfoEntity newsInfoEntity){

        newsInfoService.insertNews(newsInfoEntity);
        return newsInfoEntity;
    }

    /**
     * @Author panzc
     * @Description //TODO
     * @Date 下午 4:37 2019/1/10 0010
     * @Param 获取新闻详情
     * @Version 1.0.0
     **/
    @GetMapping("/news/newsInfo")
    public NewsInfoEntity getNewsInfo(int id){
        NewsInfoEntity newsInfoEntity = new NewsInfoEntity();
        newsInfoEntity = newsInfoService.getNews(id);
        return newsInfoEntity;
    }

    /**
     * @Author panzc
     * @Description //TODO
     * @Date 下午 4:45 2019/1/10 0010
     * @Param 更新
     * @Version 1.0.0
     **/
    @PutMapping("/news/update/{id}")
    public NewsInfoEntity updateNews(@RequestBody NewsInfoEntity newsInfoEntity,@PathVariable int id){
        if(newsInfoEntity.getId()==id){
            newsInfoService.updateNews(newsInfoEntity);
        }
        return newsInfoEntity;
    }

    /**
     * @Author panzc
     * @Description //TODO
     * @Date 下午 4:45 2019/1/10 0010
     * @Param 删除
     * @Version 1.0.0
     **/
    @DeleteMapping("/news/delete/{id}")
    public NewsInfoEntity deleteNews(@RequestBody NewsInfoEntity newsInfoEntity,@PathVariable int id){
        if(newsInfoEntity.getId()==id){
            newsInfoService.deleteNews(id);
        }
        return newsInfoEntity;
    }


}
