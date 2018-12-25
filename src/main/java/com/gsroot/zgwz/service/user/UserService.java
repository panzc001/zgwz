/*
 * Copyright (c) 2018-2028 甘肃根目录网络科技有限公司 All Rights Reserved.
 * ProjectName: zgwz
 */

package com.gsroot.zgwz.service.user;

import com.github.pagehelper.PageInfo;
import com.gsroot.zgwz.model.User;

/**
 * @author Administrator
 * @Title: UserService
 * @ProjectName zgwz
 * @Description: TODO管理员用户service
 * @date 2018/12/18 0018下午 5:14
 */
public interface UserService {
    /**
     * @Author Administrator
     * @Description //TODO
     * @Date 下午 5:19 2018/12/18 0018
     * @Param
     * @Version 1.0.0
     **/
    PageInfo<User> getAllUser(int pageNum,int pageSize);

    /**
     * 登录
     * @param userName
     * @param password
     * @return
     */
    User login(String userName,String password);

    /**
     * @Author Administrator
     * @Description //TODO 插入新用户
     * @Date 下午 2:57 2018/12/20 0020
     * @Param
     * @Version 1.0.0
     **/
    User insertUser(User user);

    /**
     * @Author Administrator
     * @Description //TODO 修改用户密码
     * @Date 下午 2:57 2018/12/20 0020
     * @Param
     * @Version 1.0.0
     **/
    User updatePassword(User user);
}
