/*
 * Copyright (c) 2018-2028 甘肃根目录网络科技有限公司 All Rights Reserved.
 * ProjectName: zgwz
 */

package com.gsroot.zgwz.mapper.news;

import com.gsroot.zgwz.model.news.NewsInfoEntity;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author panzc
 * @Title: NewsInfoSqlProvider
 * @ProjectName zgwz
 * @Description: TODO
 * @date 2019/1/10 0010上午 9:48
 */
public class NewsInfoSqlProvider {

    public String insertNews(NewsInfoEntity newsInfoEntity){
        return new SQL(){{
            INSERT_INTO("news_info");
            if(StringUtils.isNotBlank(newsInfoEntity.getNewsName())){
                VALUES("news_name",newsInfoEntity.getNewsName());
            }
            if(StringUtils.isNotBlank(newsInfoEntity.getNewsPhoto())){
                VALUES("news_photo",newsInfoEntity.getNewsPhoto());
            }
            if(StringUtils.isNotBlank(newsInfoEntity.getNewsContent())){
                VALUES("news_content",newsInfoEntity.getNewsContent());
            }
            if(StringUtils.isNotBlank(newsInfoEntity.getNewsType())){
                VALUES("news_type",newsInfoEntity.getNewsType());
            }
            if(StringUtils.isNotBlank(newsInfoEntity.getVideoUrl())){
                VALUES("video_url",newsInfoEntity.getVideoUrl());
            }
            if(StringUtils.isNotBlank(newsInfoEntity.getVideoType())){
                VALUES("video_type",newsInfoEntity.getVideoType());
            }
            if(StringUtils.isNotBlank(newsInfoEntity.getCreateTime())){
                VALUES("create_time",newsInfoEntity.getCreateTime());
            }
            if(StringUtils.isNotBlank(newsInfoEntity.getIsPush())) {
                VALUES("is_push", newsInfoEntity.getIsPush());
            }
                VALUES("state",newsInfoEntity.getState()+"");
                VALUES("top_order",newsInfoEntity.getTopOrder()+"");


        }}.toString();
    }

    public String deleteNews(int id){
        return new SQL(){{
            UPDATE("news_info");
            SET("state=0");
            WHERE("id=#{id}");
        }}.toString();
    }

    public String getAllNews(@Param("pageSize") int pageSize, @Param("start") int start){
        return "select * from news_info order by create_time desc limit #{start},#{pageSize}";
    }

    public String newsSize(@Param("pageSize") int pageSize, @Param("start") int start){
        return "select count(*) from news_info";
    }

    public String getTopNews(@Param("pageSize") int pageSize, @Param("start") int start){
        return "select * from news_info order by top_order desc limit #{start},#{pageSize}";
    }

    public String getNews(int id){
        return new SQL(){{
            SELECT("*");
            FROM("news_info");
            WHERE("id = #{id}");
        }}.toString();
    }

    public String updateNews(NewsInfoEntity newsInfoEntity){
        return new SQL(){{
            UPDATE("news_info");
            SET("news_name = #{newsName}");
            SET("news_photo = #{newsPhoto}");
            SET("news_content = #{newsContent}");
            SET("news_type = #{newsType}");
            SET("video_url = #{videoUrl}");
            SET("video_type = #{videoType}");
            SET("create_time = #{createTime}");
            SET("is_push = #{isPush}");
            SET("top_order = #{topOrder}");
            SET("state = #{state}");
            WHERE("id=#{id}");

        }}.toString();
    }


}
