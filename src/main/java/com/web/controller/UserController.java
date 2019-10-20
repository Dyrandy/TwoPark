package com.web.controller;

import com.web.service.UserService;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.print.Pageable;

@Controller
public class UserController {
    UserService UserService;

    @GetMapping("/user/info")
    public String info(){
        return "user/info";
    }

    @GetMapping("/user/change")
    public String change(){
        return  "user/change";
    }

    @GetMapping("/register")
 //   public String register(@RequestParam(value = "idx", defaultValue = "a") String A, @RequestParam(value = "idx", defaultValue = "b") String B, @RequestParam(value = "idx", defaultValue = "c") String  C,Model model){
        public String register(Model model){
        model.addAttribute("register", UserService.register("A","B" , "C"));
        return "user/register";
    }
}
