package com.example.springbootdemo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

//绑定配置文件属性的对象
@ConfigurationProperties(prefix = "com.boot")
public class ConfigBean {
  private String name;
  private String greet;

  public String getName() {
    return name;
  }

  public void setName( String name ) {
    this.name = name;
  }

  public String getGreet() {
    return greet;
  }

  public void setGreet( String greet ) {
    this.greet = greet;
  }
}
