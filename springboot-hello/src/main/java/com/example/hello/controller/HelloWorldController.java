package com.example.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloWorldController
 * @Description TODO
 * @Author yangjunqi
 * @Date 2021/1/20 17:36
 * @Version 1.0
 **/
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
