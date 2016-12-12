package com.yhj.provider;

import com.yhj.pojo.User;
import org.apache.commons.lang.StringUtils;

/**
 * Created by YHJ on 2016/9/4.
 */
public class Userprovider {

    public String find(User user){
        StringBuilder sb = new StringBuilder("select * from user where 1=1 ");
        if(user.getId()!=null)
            sb.append("and id = #{id}");
        if(StringUtils.isNotBlank(user.getUsername()))
            sb.append("and username = #{username} ");
        if(StringUtils.isNotBlank(user.getPassword()))
            sb.append("and password = #{password} ");
        if(StringUtils.isNotBlank(user.getNickname()))
            sb.append("and nickname = #{nickname} ");
        return sb.toString();
    }

    public String update(User user){
        StringBuilder sb = new StringBuilder("update user set id = #{id}");
        if(StringUtils.isNotBlank(user.getUsername()))
            sb.append(", username = #{username} ");
        if(StringUtils.isNotBlank(user.getPassword()))
            sb.append(", password = #{password} ");
        if(StringUtils.isNotBlank(user.getNickname()))
            sb.append(", nickname = #{nickname} ");
        sb.append("where id = #{id}");
        return sb.toString();
    }
}
