package com.web.service;

import com.web.domain.User;

public interface UserService {
    public void InsertUser(User user);
    public void UpdateUser(User user);
    public void DeleteUser(User user);
    public User SelectUser(User user);
}
