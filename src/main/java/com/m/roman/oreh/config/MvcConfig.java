package com.m.roman.oreh.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Paths;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//
//        registry.addResourceHandler("/static/**")
//                .addResourceLocations("classpath:/static/**");
//
//
//        registry.addResourceHandler("/img/**")
//                .addResourceLocations("file:/" + Paths.get("images").toFile().getAbsolutePath() + "/")
//        ;
//    }
}