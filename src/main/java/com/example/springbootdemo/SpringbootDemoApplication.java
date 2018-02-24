package com.example.springbootdemo;

import com.example.springbootdemo.bean.ConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConfigBean.class) //制定绑定配置文件的bean
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);

	}

	//打印所有spring-boot预配置的bean依赖
//	@Bean
//  public CommandLineRunner commandLineRunner( ApplicationContext appContext){
//	  return  args -> {
//      System.out.println("beans provided by Spring Boot:");
//      String[] beanNames = appContext.getBeanDefinitionNames();
//      Arrays.sort(beanNames);
//
//      for (String name : beanNames){
//        System.out.println(name);
//      }
//    };
//  }

}