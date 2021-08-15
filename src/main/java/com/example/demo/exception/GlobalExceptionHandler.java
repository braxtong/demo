package com.example.demo.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler{

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String aaa(MethodArgumentNotValidException e){
        return e.getBindingResult().getFieldError().getDefaultMessage();
    }
}
