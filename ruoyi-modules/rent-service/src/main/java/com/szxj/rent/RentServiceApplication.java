package com.szxj.rent;

import com.ruoyi.common.security.annotation.EnableRyFeignClients;
import com.ruoyi.common.swagger.annotation.EnableCustomSwagger2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.szxj.rent.mapper")
// 表示通过aop框架暴露该代理对象,AopContext能够访问
@EnableAspectJAutoProxy(exposeProxy = true)
@EnableCustomSwagger2
@EnableRyFeignClients
public class RentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentServiceApplication.class, args);
    }

}
