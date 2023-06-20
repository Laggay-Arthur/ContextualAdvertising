package com.contextadvertising.demo.Exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice
public class DefaultMethodArgumentTypeMismatchException {
@ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public String handleException(MethodArgumentTypeMismatchException ex){
        String name = ex.getName();
        System.out.println(name + " parameter is missing");
        return "redirect:/campaigns";
    }
}
