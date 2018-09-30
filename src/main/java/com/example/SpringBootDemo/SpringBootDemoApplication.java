package com.example.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Application.java 建议放到跟目录下面,主要用于做一些框架配置
 * @author 杨云飞
 * @date 2018年9月12日
 */
/*@SpringbootApplication注解  可以解决根类或者配置类（我自己的说法，就是main所在类）头上注解过多的问题，
 * 一个@SpringbootApplication相当于
 * @Configuration,@EnableAutoConfiguration和 @ComponentScan 并具有他们的默认属性值*/
@SpringBootApplication
public class SpringBootDemoApplication {
	public static void main(String[] args) {
		System.out.println(" springApplication run !"+"@@@@@@@@@@@!!!!!!!!!!!!!------------");
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
