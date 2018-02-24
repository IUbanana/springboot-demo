package com.example.springbootdemo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Girl {

  @Id
  @GeneratedValue   //自增
  private int id;

  private String name;

  private int height;

  public Girl() {

  }

  public int getId() {
    return id;
  }

  public void setId( int id ) {
    this.id = id;
  }

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

  @Override
  public String toString() {
    return "Girl{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", height=" + height +
            '}';
  }
}
