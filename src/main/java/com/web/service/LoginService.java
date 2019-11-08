package com.web.service;

import com.web.domain.User;

public interface LoginService {
    public User login(User user);
    public boolean checkSession(String cookie);
}
