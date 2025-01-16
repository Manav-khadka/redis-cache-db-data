package com.manav.redisimplementationdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisimplementationdbApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisimplementationdbApplication.class, args);
    }

}
