package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.ConfigBean;
import com.example.springbootdemo.bean.GirlConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")   //整个类映射的url
public class HelloController {

//  //@Value 获取配置文件中的属性值
////  @Value("${com.boot.name}")
////  private String name;
////
////  @Value("${com.boot.greet}")
////  private String greet;

  //注入绑定配置文件的bean
  @Autowired
  ConfigBean configBean;

  @Autowired
  GirlConfigBean girlConfigBean;

  @RequestMapping()
  public String hello(){
    return "Greetings from Spring Boot!  " + configBean.getName() + ":" + configBean.getGreet();
  }

  //多url映射，以集合的方式 http://localhost:8081/hello/index1
  @RequestMapping(value = {"/index1","/index2"}, method = RequestMethod.GET)
//  public String index(@PathVariable("id") Integer id) {
  //value 参数名，required 是否必传，defaultValue 默认值
  public String index(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
    return "id: " + id;
//    return "Greetings from Spring Boot!  " + configBean.getName() + ":" + configBean.getGreet()
//            + "        " + girlConfigBean.getName() + ", " + girlConfigBean.getHeight() + ", " + girlConfigBean.getWeight() ;
  }

//  @Bean
//  public FilterRegistrationBean filterRegistrationBean() {
//    FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//    CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//    characterEncodingFilter.setForceEncoding(true);
//    characterEncodingFilter.setEncoding("UTF-8");
//    registrationBean.setFilter(characterEncodingFilter);
//    return registrationBean;
//  }

}
