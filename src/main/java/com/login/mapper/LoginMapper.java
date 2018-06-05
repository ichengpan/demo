package com.login.mapper;

import com.login.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {

    UserInfo login(UserInfo userInfo);
}
