package com.demo.service;

import com.demo.model.Result;
import com.demo.model.User;

import java.util.List;

public interface UserService {
    Result selectUserList();

    void addUserInfo(User user);
}
