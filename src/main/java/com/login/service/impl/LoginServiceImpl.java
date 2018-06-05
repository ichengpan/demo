package com.login.service.impl;

import com.demo.model.Result;
import com.demo.model.ResultBuilder;
import com.login.mapper.LoginMapper;
import com.login.model.UserInfo;
import com.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    private static ResultBuilder resultBuilder = new ResultBuilder();

    @Override
    public Result login(UserInfo userInfo) {
        UserInfo info = loginMapper.login(userInfo);
        if (info != null){
            return resultBuilder.success();
        } else {
            return resultBuilder.error(555,"账号或密码错误");
        }

    }
}
