package com.login.service;

import com.demo.model.Result;
import com.login.model.UserInfo;

public interface LoginService {
    Result login(UserInfo userInfo);
}
