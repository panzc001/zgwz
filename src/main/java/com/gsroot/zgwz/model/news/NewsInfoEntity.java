/*
 * Copyright (c) 2018-2028 甘肃根目录网络科技有限公司 All Rights Reserved.
 * ProjectName: zgwz
 */

package com.gsroot.zgwz.model.news;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author panzc
 * @Title: NewsInfoEntity
 * @ProjectName zgwz
 * @Description: TODO
 * @date 2019/1/10 0010上午 9:01
 */
@Data
@NoArgsConstructor
public class NewsInfoEntity {

    private int id;
    private String newsName;//新闻名称
    private String newsPhoto;//新闻图片
    private String newsContent;//新闻内容
    private String newsType;//新闻类型 0公司新闻，1行业新闻，2集团新闻，3视频中心
    private String videoUrl;//视频url
    private String videoType;//视频类型 视频分类 0新闻视频1公司视频
    private String createTime;//创建时间
    private String isPush;//是否推送首页 是否推荐至首页0 不推荐 1推荐
    private int topOrder;//首页排序 倒序
    private int state;//状态 0无效 1有效
}
