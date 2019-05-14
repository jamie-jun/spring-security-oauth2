package com.github.oauth2;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @program: spring-security-oauth2
 * @description:
 * @author: Jamie
 * @create: 2019-05-13 13:00
 **/

public class passwordEncoderTest {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }
}
