package com.m.roman.oreh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.m.roman.oreh")
public class OrehApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrehApplication.class, args);
    }

}
