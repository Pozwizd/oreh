package com.m.roman.oreh.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    // TODO: Переместить картинки в отдельную папку


//    @Override
//    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
//        resolvers.add(new DefaultHandlerExceptionResolver());
//    }


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