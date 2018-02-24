package com.example.springbootdemo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GirlControllerTest {

  @Autowired
  private MockMvc mvc;

  @Test
  public void girlList() throws Exception {
    //测试API返回值
    mvc.perform(MockMvcRequestBuilders.get("/girls"))
            //判断状态码是否为200
            .andExpect(MockMvcResultMatchers.status().isOk());
            //判断返回的内容
//            .andExpect(MockMvcResultMatchers.content().string("abc"));
  }

  @Test
  public void findOneById() {
  }
}