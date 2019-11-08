package com.web.service.Impl;

import com.web.domain.User;
import com.web.Mapper.LoginMapper;
import com.web.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    LoginMapper loginMapper;

    @Override
    public User login(User user){
        return loginMapper.login(user);
    }

    @Override
    public boolean checkSession(String cookie){
        byte[] result = Base64.getDecoder().decode(cookie);
        String session = new String(result);
//        System.out.println(session);

        User user = new User();
        user = loginMapper.check(session);

        if(user != null)
            return true;
        return false;
    }

}
