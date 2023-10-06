package com.m.roman.oreh.exception;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;


@ControllerAdvice
public class GlobalExceptionHandler {
 //   NoSuchRequestHandlingMethodException.class
    @ExceptionHandler(NoHandlerFoundException.class)
    public String handleNotFound(Exception ex) {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("404");
        return "404";

    }

}