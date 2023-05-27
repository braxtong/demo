package com.example.demo;

import com.example.demo.Model.Person;
import com.example.demo.Model.PersonRes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLOutput;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);

        String[] arrs = run.getBeanDefinitionNames();
        Arrays.stream(arrs)
                .filter(x-> x.startsWith("us"))
                .filter(y->y.endsWith("1")).forEach(
                System.out::println
        );
    }
}
