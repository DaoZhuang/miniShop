package com.minishop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.minishop.common.mapper")
public class MinishopApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinishopApplication.class, args);
    }
}
