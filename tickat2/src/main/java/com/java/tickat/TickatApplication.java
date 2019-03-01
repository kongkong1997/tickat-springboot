package com.java.tickat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TickatApplication {

    public static void main(String[] args) {
        SpringApplication.run(TickatApplication.class, args);
    }

}
