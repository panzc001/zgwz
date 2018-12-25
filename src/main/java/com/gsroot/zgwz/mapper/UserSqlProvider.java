package com.gsroot.zgwz.mapper;

import com.gsroot.zgwz.model.User;
import org.apache.ibatis.jdbc.SQL;

/**
 * @Author Administrator
 * @Description //TODO user动态sql提供器
 * @Date 下午 5:06 2018/12/18 0018
 * @Param
 * @Version 1.0.0
 **/
public class UserSqlProvider {

    public String getAllUserSql(){
        return "select * from user_account order by create_time asc";
    }

    /**
     * @Author Administrator
     * @Description //TODO  登录
     * @Date 下午 1:36 2018/12/20 0020
     * @Param
     * @Version 1.0.0
     **/
    public String loginSql(String userName,String password){
        return "select * from user_account t where t.name = #{userName} and t.password = #{password}  order by t.create_time asc";
    }

    /**
     * 插入用户sql
     * @param id
     * @param name
     * @param password
     * @param mobile
     * @return
     */
    public String insertUserSql(User user){

        return new SQL(){{
            INSERT_INTO("user_account");
            VALUES("name","#{name}");
            VALUES("password","#{password}");
            VALUES("mobile","#{mobile}");
            VALUES("create_time", "#{create}");

        }

        }.toString();
    }

    /**
     * 修改密码
     * @param user
     * @return
     */
    public String updateUserPasswordSql(User user){

        return new SQL(){{
            UPDATE("user_account");
            if(user.getPassword() != null){
                SET("password = #{password}");
            }
            WHERE("id = #{id}");


        }}.toString();

    }
}

