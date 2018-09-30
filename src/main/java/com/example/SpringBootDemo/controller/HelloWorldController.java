package com.example.SpringBootDemo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController 的意思就是controller里面的方法都
 * 以json格式输出，不用再写什么jackjson配置的了！
 * @author 杨云飞
 * @date 2018年9月12日
 */
/*这个注释告诉SpringBoot“猜”你将如何想配置Spring,基于你已经添加jar依赖项。如果spring-boot-starter-web已经添加Tomcat和Spring MVC,这个注释自动将假设您正在开发一个web应用程序并添加相应的spring设置。

　　自动配置被设计用来和“Starters”一起更好的工作,但这两个概念并不直接相关。您可以自由挑选starter依赖项以外的jar包，springboot仍将尽力自动配置您的应用程序。

　　spring通常建议我们将main方法所在的类放到一个root包下，@EnableAutoConfiguration（开启自动配置）注解通常都放到main所在类的上面，下面是一个典型的结构布局：com

 +- example

     +- myproject

         +- Application.java

         |

         +- domain

         |   +- Customer.java

         |   +- CustomerRepository.java

         |

         +- service

         |   +- CustomerService.java

         |

         +- web

             +- CustomerController.java 
*/
@RestController
@EnableAutoConfiguration
public class HelloWorldController {
    @RequestMapping("/")
    String index() {
        return "Hello World";
    }
    
    @RequestMapping("/hello")
    String index2() {
        return "Hello World222";
    }
}
