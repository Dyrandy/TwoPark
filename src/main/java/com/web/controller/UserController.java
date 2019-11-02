package com.web.controller;

import com.web.service.UserService;
import com.web.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Null;
import java.awt.print.Pageable;

@Controller
public class UserController {

    @Autowired
    UserService userService;

 //   @GetMapping("/user/info")
  //  public String info(){
 //       return "user/info";
  //  }

    @GetMapping("/user/info")
    public String change(Model model, @RequestParam("id") String id){
        User user = new User();
        user.setID(id);
        User user1 = userService.SelectUser(user);
        model.addAttribute("list", user1);
        return "user/change_test";
    }

     @PostMapping("/user/change")
     public String Postchange(@RequestParam("newid") String newID, @RequestParam("id") String id){
         User user = new User();
         user.setID(id);
         user.updateID(newID);
         userService.UpdateUser(user);
         return  "user/change";
     }


     @GetMapping("/user/delete")
     public String DeleteUser(@RequestParam("id") String id){
        User user = new User();
        user.setID(id);
        userService.DeleteUser(user);
        return "index";
     }


    @GetMapping("/register")
    public String register(Model model){
        return "user/register";
    }

    @PostMapping("/register")
    public String PostRegister(@RequestParam("user_id") String id, @RequestParam("user_password") String pw, @RequestParam("user_nickname") String nickname, @RequestParam("user_email") String email, Model model) {
        if (id == "" || pw == "" || email == "" || nickname == "") {
            return "error";
        } else {
            User user = new User();
            user.setID(id);
            user.setPW(pw);
            user.setNickname(nickname);
            user.setEmail(email);
            userService.InsertUser(user);
            return "login/login";
        }
    }
}
