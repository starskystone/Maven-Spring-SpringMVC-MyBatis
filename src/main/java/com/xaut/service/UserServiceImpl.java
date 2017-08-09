package com.xaut.service;

import com.xaut.mapper.UserMapper;
import com.xaut.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public List<User> findeUser() throws Exception {
        List<User> users = userMapper.selectByExample(null);
        return users;
    }
}
