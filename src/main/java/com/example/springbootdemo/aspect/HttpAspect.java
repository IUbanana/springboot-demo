package com.example.springbootdemo.aspect;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 记录所有http请求的AOP类
 */
@Aspect
@Controller
public class HttpAspect {

  private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);
//  @Before("execution(public * com.example.springbootdemo.controller.GirlController.girlList(..))")
//  public void log(){
//    System.out.println("11111");
//  }

  @Pointcut("execution(public * com.example.springbootdemo.controller.GirlController.*(..))")
  public void log(){
  }

  @Before("log()")
  public void doBefore(){
    //获取 RequestContextHolder 对象，并转换为 ServletRequestAttributes
    ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    //获取 HttpServletRequest 对象
    HttpServletRequest request = attributes.getRequest();
    logger.info("--------HttpRequest信息---------");
    //url、method、ip
    logger.info("url={}", request.getRequestURL());
    logger.info("method={}", request.getMethod());
    logger.info("ip={}", request.getRemoteAddr());
    //类方法
//    logger.info("class_method={}",  );
//    logger.info("args={}", );
  }

  @After("log()")
  public void doAfter(){
//    System.out.println("222222");
    logger.info("222222222");
  }

  /**
   * 接受返回的内容
   */
  @AfterReturning(returning = "obj", pointcut = "log()")
  public void doAfterReturning(Object obj){
//    logger.info("response={}", obj.toString());
  }


}
