package com.gsroot.zgwz.mapper;

import com.gsroot.zgwz.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
/**
 * @Author Administrator
 * @Description //TODO 管理员用户表mapper
 * @Date 下午 5:12 2018/12/18 0018
 * @Param
 * @Version 1.0.0
 **/

@Mapper
public interface UserMapper {

    //查询所有管理员用户
    @SelectProvider(type=UserSqlProvider.class,method = "getAllUserSql")
    List<User> findAllUser();

    //插入新用户
    @SelectProvider(type=UserSqlProvider.class,method = "insertUserSql")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    User insertUser(User user);

    //登录
    @SelectProvider(type=UserSqlProvider.class,method = "loginSql")
    User login(String userName,String password);

    @SelectProvider(type=UserSqlProvider.class,method = "updateUserPasswordSql")
    User updatePassword(User user);

}
