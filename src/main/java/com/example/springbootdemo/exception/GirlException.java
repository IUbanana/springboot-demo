package com.example.springbootdemo.exception;

import com.example.springbootdemo.enums.ResultEnum;

//Spring 只对 RuntimeException 进行事务回滚，对 Exception 不会
public class GirlException extends RuntimeException {

  private Integer code;

  public GirlException( ResultEnum resultEnum ) {
    super(resultEnum.getMsg());
    this.code = resultEnum.getCode();
  }

  public Integer getCode() {
    return code;
  }

  public void setCode( Integer code ) {
    this.code = code;
  }
}
