package com.demo.controller;

import com.demo.model.Result;
import com.demo.model.ResultBuilder;
import com.demo.model.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    private static ResultBuilder resultBuilder = new ResultBuilder();

    @RequestMapping("/hello")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping("/getMsg")
    public String getMsg() {
        return "OK";
    }

    @PostMapping("/addUser")
    public Result addUser(@RequestBody User user) {
        userService.addUserInfo(user);
        return resultBuilder.success();

    }

    @RequestMapping("/getUserInfo")
    public Result getUserInfo() {
        return userService.selectUserList();
    }
}
