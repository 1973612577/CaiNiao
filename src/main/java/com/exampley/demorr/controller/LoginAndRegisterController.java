package com.exampley.demorr.controller;

import com.exampley.demorr.entity.User;
import com.exampley.demorr.service.LoginAndRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginAndRegisterController {
    @Autowired
    private LoginAndRegisterService loginAndRegisterService;
    @RequestMapping("/register")
    @ResponseBody
    public void register(String registerNum,String name,String phone,String password){
        User user=new User();
        user.setNumber(registerNum);
        user.setName(name);
        user.setPassword(password);
        user.setPhone(phone);
        System.out.println(user);
        loginAndRegisterService.register(user);
    }
}
