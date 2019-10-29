package com.web.Service.Impl;

import com.web.Domain.User;
import com.web.Mapper.UserMapper;
import com.web.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public void InsertUser(User user){
        userMapper.insert(user);
    }
}
