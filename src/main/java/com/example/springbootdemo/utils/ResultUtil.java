package com.example.springbootdemo.utils;

import com.example.springbootdemo.bean.Result;
import com.example.springbootdemo.enums.ResultEnum;

public class ResultUtil {

  //结果成功返回
  public static Result success(Object object){
    Result result = new Result();
    result.setCode(ResultEnum.SUCCESS.getCode());
    result.setMsg(ResultEnum.SUCCESS.getMsg());
    result.setData(object);
    return result;
  }

  public static Result success(){
    return success(null);
  }

  //结果返回失败：错误码+错误信息
  public static Result fail(ResultEnum resultEnum){
    Result result = new Result();
    result.setCode(resultEnum.getCode());
    result.setMsg(resultEnum.getMsg());
    return result;
  }

  public static Result fail(Integer code, String msg){
    Result result = new Result();
    result.setCode(code);
    result.setMsg(msg);
    return result;
  }



}
