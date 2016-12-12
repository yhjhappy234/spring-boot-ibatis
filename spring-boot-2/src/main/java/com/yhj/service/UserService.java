package com.yhj.service;

import com.yhj.pojo.User;

import java.util.List;

/**
 * Created by YHJ on 2016/9/3.
 */
public interface UserService {

    int insert(User user);

    List<User> find(User user);

    int update(User user);

    int delete(Integer id);
}
