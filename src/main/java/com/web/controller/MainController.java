package com.web.controller;

import com.web.service.BoardService;

import com.web.service.LoginService;
import com.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Base64;

@Controller
@RequestMapping({"/", ""})
public class MainController {

    LoginService loginService;

    @GetMapping({"", "/", "/index"})
    public String index(HttpServletRequest request, Model model, @CookieValue(defaultValue = "") String LOGINSESSION){
        boolean check = loginService.checkSession(LOGINSESSION);
        model.addAttribute("loginSuccess", check);
        return "index";
    }
}
