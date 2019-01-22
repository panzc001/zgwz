/*
 * Copyright (c) 2018-2028 甘肃根目录网络科技有限公司 All Rights Reserved.
 * ProjectName: zgwz
 */

package com.gsroot.zgwz.mapper.news;

import com.gsroot.zgwz.model.news.NewsInfoEntity;
import com.gsroot.zgwz.model.sys.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

/**
 * @author panzc
 * @Title: NewsInfoDao
 * @ProjectName zgwz
 * @Description: TODO
 * @date 2019/1/10 0010上午 9:47
 */
@Mapper
public interface NewsInfoDao {

    @InsertProvider(type = NewsInfoSqlProvider.class,method = "insertNews")
    public void insertNews(@Param("newsInfoEntity") NewsInfoEntity newsInfoEntity);

    @UpdateProvider(type = NewsInfoSqlProvider.class,method = "updateNews")
    public void updateNews(@Param("newsInfoEntity") NewsInfoEntity newsInfoEntity);

    @SelectProvider(type=NewsInfoSqlProvider.class,method = "getAllNews")
    public NewsInfoEntity getNews(int id);

    @UpdateProvider(type = NewsInfoSqlProvider.class,method = "deleteNews")
    public void deleteNews(int id);

    @SelectProvider(type=NewsInfoSqlProvider.class,method = "getAllNews")
    public ArrayList<NewsInfoEntity> getAllNews(@Param("pageSize") int pageSize, @Param("start") int start);

    @SelectProvider(type=NewsInfoSqlProvider.class,method = "newsSize")
    public Integer newsSize(@Param("pageSize") int pageSize, @Param("start") int start);

    @SelectProvider(type=NewsInfoSqlProvider.class,method = "getTopNews")
    public ArrayList<NewsInfoEntity> getTopNews(@Param("pageSize") int pageSize, @Param("start") int start);

}
