package com.yhj.service.impl;

import com.yhj.mapper.UserMapper;
import com.yhj.pojo.User;
import com.yhj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by YHJ on 2016/9/3.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> find(User user) {
        return userMapper.find(user);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public int delete(Integer id) {
        return userMapper.delete(id);
    }

}
