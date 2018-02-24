package com.example.springbootdemo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "girl")
public class GirlConfigBean {
  private String name;
  private int height;
  private int weight;

  public String getName() {
    return name;
  }

  public void setName( String name ) {
    this.name = name;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight( int height ) {
    this.height = height;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight( int weight ) {
    this.weight = weight;
  }
}
