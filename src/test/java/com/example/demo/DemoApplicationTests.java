package com.example.demo;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@DisplayName("test an")
@SpringBootTest
class DemoApplicationTests {

    @Test
    void test01() {
        System.out.println(1);
    }

    @Test
    void test02(){
        System.out.println(2);
    }

    @BeforeEach
    void beforEach(){
        System.out.println("BeforEach");
    }

    @AfterEach
    void afterEach(){
        System.out.println("afterEach");
    }

    @BeforeAll
    static void berforAll(){
        System.out.println("berforAll");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("AfterAll");
    }

}
