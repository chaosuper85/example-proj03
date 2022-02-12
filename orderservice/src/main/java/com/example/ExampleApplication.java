package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhuchao
 * @date 2022/2/12 9:10 下午
 */
@SpringBootApplication
public class ExampleApplication {
    public static void main(String[] args) {
        try{
            SpringApplication.run(ExampleApplication.class, args);
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
