package com.example.demo.controller;

import com.example.demo.Model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@Slf4j
@RestController
@RefreshScope
public class HelloController {

    @Value("${java1234.name}")
    private String name;
    @Value("${java1234.age}")
    private String age;
    @GetMapping("/index")
    public String test(){
        return name+":"+age;
    }

}
