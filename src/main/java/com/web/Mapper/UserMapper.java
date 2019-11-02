package com.web.Mapper;

import com.web.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public void insert(User user);
    public void update(User user);
    public void delete(User user);
    public User select(User user);
}
