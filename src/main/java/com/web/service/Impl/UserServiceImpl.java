package com.web.service.Impl;

import com.web.domain.User;
import com.web.Mapper.UserMapper;
import com.web.service.UserService;
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

    @Override
    public void UpdateUser(User user) { userMapper.update(user);}
}
