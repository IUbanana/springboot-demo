package com.example.springbootdemo.handle;

import com.example.springbootdemo.bean.Result;
import com.example.springbootdemo.enums.ResultEnum;
import com.example.springbootdemo.exception.GirlException;
import com.example.springbootdemo.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class ExceptionHandle {
  private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

  //声明要捕获的异常类 GirlException.class
  @ExceptionHandler(value = GirlException.class)
  @ResponseBody
  public Result handle(Exception e){
    if(e instanceof GirlException){
      GirlException g = (GirlException)e;
      return ResultUtil.fail(g.getCode(), g.getMessage());
    } else {
      logger.error("【系统异常】{}", e);
      return ResultUtil.fail(ResultEnum.UNKNOWN_ERROR);
    }
  }

}
