package com.web.service;


import com.web.domain.User;
import com.web.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

public class UserService {

    private UserRepository UserRepository;

    public UserService(UserRepository UserRepository) {
        this.UserRepository = UserRepository;
    }

    public User register(String name2, String password, String email){
        return UserRepository.save(new User(name2,password,email,LocalDateTime.now(),LocalDateTime.now()));
    }

}
