package com.github.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @program: spring-security-oauth2
 * @description:
 * @author: Jamie
 * @create: 2019-05-14 14:52
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.github.oauth2.resource.mapper")
public class OAuth2ResourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAuth2ResourceApplication.class,args);
    }
}
