package com.example.springbootdemo.enums;

public enum ResultEnum {
  UNKNOWN_ERROR(-1, "未知错误"),
  SUCCESS(0, "成功"),
  SHORT(100, "小矮人"),
  TALL(101, "绿巨人")
  ;

  private Integer code;
  private String msg;

  ResultEnum( Integer code, String msg ) {
    this.code = code;
    this.msg = msg;
  }

  public Integer getCode() {
    return code;
  }

  public String getMsg() {
    return msg;
  }
}
