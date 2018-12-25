/*
 * Copyright (c) 2018-2028 甘肃根目录网络科技有限公司 All Rights Reserved.
 * ProjectName: zgwz
 */

package com.gsroot.zgwz.service.user.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gsroot.zgwz.mapper.UserMapper;
import com.gsroot.zgwz.model.User;
import com.gsroot.zgwz.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @Title: UserServiceImpl
 * @ProjectName zgwz
 * @Description: TODO
 * @date 2018/12/18 0018下午 5:23
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageInfo<User> getAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userMapper.findAllUser();
        PageInfo result = new PageInfo(users);
        return result;
    }

    @Override
    public User login(String userName, String password) {
        return userMapper.login(userName,password);
    }

    @Override
    public User insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public User updatePassword(User user) {
        return userMapper.updatePassword(user);
    }


}
