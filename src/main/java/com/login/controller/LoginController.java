package com.login.controller;

import com.demo.model.Result;
import com.login.model.UserInfo;
import com.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/getMsg")
    public String getMsg(){
        return "成功";
    }

    @PostMapping("/login")
    public Result login(@RequestBody UserInfo userInfo){
        return loginService.login(userInfo);
    }
}
