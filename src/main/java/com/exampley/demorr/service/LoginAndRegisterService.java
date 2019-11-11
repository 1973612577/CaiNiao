package com.exampley.demorr.service;

import com.exampley.demorr.dao.LoginAndRegisterMapper;
import com.exampley.demorr.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginAndRegisterService {
    @Autowired
    private LoginAndRegisterMapper loginAndRegisterMapper;
    public void register(User user){
        loginAndRegisterMapper.insert(user);
    }
}
