package com.yhj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by YHJ on 2016/9/4.
 */
@Component("appConfig")
@ConfigurationProperties(prefix="app")
public class AppConfig implements Serializable{

    private String name;
    private String notice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }
}
