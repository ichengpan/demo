package com.demo.mapper;

import com.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> queryUserList();

    int insertUserInfo(User user);
}
