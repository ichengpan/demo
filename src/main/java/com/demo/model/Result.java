package com.demo.model;

import lombok.Data;

@Data
public class Result {

    private int code;//状态码

    private String msg;//信息

    private Object data;//数据
}
