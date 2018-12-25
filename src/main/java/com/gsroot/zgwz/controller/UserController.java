/*
 * Copyright (c) 2018-2028 甘肃根目录网络科技有限公司 All Rights Reserved.
 * ProjectName: zgwz
 */

package com.gsroot.zgwz.controller;

import com.gsroot.zgwz.model.User;
import com.gsroot.zgwz.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @Title: UserController
 * @ProjectName zgwz
 * @Description: TODO
 * @date 2018/12/18 0018下午 5:35
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping("/all")
    public Object getAll(@RequestParam(name = "pageNum", required = false, defaultValue = "1")
                                 int pageNum,
                         @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                                 int pageSize){
        return userService.getAllUser(pageNum,pageSize);
    }


    /**
     * @Author Administrator
     * @Description //TODO 登录
     * @Date 上午 9:38 2018/12/24 0024
     * @Param
     * @Version 1.0.0
     **/
    @ResponseBody
    @GetMapping("/login")
    public Object login(@RequestParam(name = "name", required = false)
                                String name,
                        @RequestParam(name = "password", required = false)
                                String password){
        User user = userService.login(name,password);
        if(user != null){
            user.setPassword("That's a secret!");
        }
        return user;

    }

}
