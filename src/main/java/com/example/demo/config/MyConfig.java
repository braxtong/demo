package com.example.demo.config;

import com.example.demo.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public User user01(){
        return new User("zhangsan","123");
    }
}
