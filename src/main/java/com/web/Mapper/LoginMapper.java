package com.web.Mapper;

import com.web.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    public User login(User user);
    public User check(String cookie);
}
