package com.example.crudwithredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CrudWithRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudWithRedisApplication.class, args);
    }

}
