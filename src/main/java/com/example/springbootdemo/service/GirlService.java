package com.example.springbootdemo.service;

import com.example.springbootdemo.bean.Girl;
import com.example.springbootdemo.enums.ResultEnum;
import com.example.springbootdemo.exception.GirlException;
import com.example.springbootdemo.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
  @Autowired
  private GirlRepository girlRepository;

  public GirlService() {
  }

  //判断身高
  public void findHeight(Integer id) throws GirlException{
    Girl girl = girlRepository.findOne(id);
    if (girl.getHeight() > 555) {
      //code = 100
      throw new GirlException(ResultEnum.TALL);
    } else if(girl.getHeight()>0 && girl.getHeight() <444) {
      //code = 101
      throw new GirlException(ResultEnum.SHORT);
    }

  }

  public Girl findOneById(Integer id){
    return girlRepository.findOne(id);
  }

}
