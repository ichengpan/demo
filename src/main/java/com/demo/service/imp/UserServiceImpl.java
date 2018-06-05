package com.demo.service.imp;

import com.demo.mapper.UserMapper;
import com.demo.model.Result;
import com.demo.model.ResultBuilder;
import com.demo.model.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    private static ResultBuilder resultBuilder = new ResultBuilder();

    @Override
    public Result selectUserList() {
        List<User> list = userMapper.queryUserList();
        return resultBuilder.success(list);
    }

    @Override
    public void addUserInfo(User user) {
        userMapper.insertUserInfo(user);
    }
}
