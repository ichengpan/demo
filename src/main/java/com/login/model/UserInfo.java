package com.login.model;

import lombok.Data;

import java.util.Date;

@Data
public class UserInfo {

    private Integer id;

    private String userName;

    private String passWord;

    private Date createTime;

    private Date modifyTime;
}
