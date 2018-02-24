package com.example.springbootdemo;

import com.example.springbootdemo.bean.Girl;
import com.example.springbootdemo.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemoApplicationTests {

//	@Test
//	public void contextLoads() {
//	}

	@Autowired
	private GirlService girlService;

	@Test
	public void findOneTest(){
		Girl girl = girlService.findOneById(6);

		//断言assert
		Assert.assertEquals(666, girl.getHeight());
	}

}
