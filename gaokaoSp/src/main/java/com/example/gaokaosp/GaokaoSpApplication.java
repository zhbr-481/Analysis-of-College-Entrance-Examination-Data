package com.example.gaokaosp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.gaokaosp.dao")
public class GaokaoSpApplication {

    public static void main(String[] args) {
        SpringApplication.run(GaokaoSpApplication.class, args);
    }

}
