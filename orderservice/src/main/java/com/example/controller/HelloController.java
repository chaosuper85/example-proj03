package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuchao
 * @date 2022/2/12 9:12 下午
 */
@RestController
@RequestMapping("consul5")
public class HelloController {
    @RequestMapping("test")
    public String test(String name) {
        return "consul5 test,"+name;
    }
}
