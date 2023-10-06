package com.m.roman.oreh.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;


@ControllerAdvice
public class GlobalExceptionHandler {
    // TODO Перехват исключения NoHandlerFoundException
//    @ExceptionHandler(NoHandlerFoundException.class)
//    public String handleNotFound(Exception ex) {
//
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("404");
//
//        return "404";
//
//    }

}