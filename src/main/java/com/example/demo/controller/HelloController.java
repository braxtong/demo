package com.example.demo.controller;

import com.example.demo.Model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@Slf4j
@RestController
public class HelloController {
    @PostMapping("/")
    public String hello(@RequestBody @Validated({User.Add.class}) User user){
        log.info(user.name);
        return user.name;
    }

}
