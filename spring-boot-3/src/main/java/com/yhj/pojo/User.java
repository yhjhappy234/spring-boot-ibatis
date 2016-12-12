package com.yhj.pojo;

import org.apache.commons.lang.StringUtils;

import java.io.Serializable;

/**
 * Created by YHJ on 2016/9/3.
 */
public class User implements Serializable{

    private static final long serialVersionUID = 233245395080429860L;

    private Integer id;
    private String username;
    private String password;
    private String nickname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public String getPasswordStr() {
        if(StringUtils.isNotBlank(password)){
            int len = password.length();
            if(len >= 3) {
                int show = 3;
                int mask = len / 2;
                show = Math.min(mask,show);
                show = (len<=6&&len%2==0) ? show-1 : show ;
                StringBuilder sb = new StringBuilder();
                for(int i=0;i<len-show*2;++i)
                    sb.append("*");
                return password.substring(0,show)+
                        sb.toString()+
                        password.substring(len-show,len);
            }

        }
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
