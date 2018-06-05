package com.demo.model;

import lombok.Data;

@Data
public class  ResultBuilder {
    //当正确时返回的值
    public static Result success(Object data){
        Result result = new Result();
        result.setCode(666);
        result.setMsg("success");
        result.setData(data);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    //当错误时返回的值
    public static Result error(int code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
