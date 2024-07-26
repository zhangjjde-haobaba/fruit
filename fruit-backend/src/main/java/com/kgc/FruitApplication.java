package com.kgc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kgc.mapper")
public class FruitApplication {

    public static void main(String[] args) {
        SpringApplication.run(FruitApplication.class, args);
    }

}
