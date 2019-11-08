package com.web.controller;

import com.web.domain.User;
import com.web.service.LoginService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Base64;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping({"","/"})
    public String login(){
        return "login/login";
    }

    @PostMapping({"", "/"})
    public String PostLogin(@RequestParam("user_id") String id, @RequestParam("user_password") String pw, Model model, HttpServletResponse response) {
        if (id == "" || pw == "") {
            return "error";
        }
        else {
            User user = new User();
            user.setID(id);
            user.setPW(pw);
            User user1 = new User();
            user1 = loginService.login(user);

            if(user1 != null){
                String EncodedValue = Base64.getEncoder().encodeToString(user1.getID().getBytes());
                Cookie cookie = new Cookie("LOGINSESSION", EncodedValue);
                cookie.setMaxAge(24 * 60 * 60);
                cookie.setSecure(true);
                cookie.setPath("/");
                response.addCookie(cookie);
                //model.addAttribute("loginSuccess", true);
                return "index";
            }

            return "login/login";
        }
    }
}
