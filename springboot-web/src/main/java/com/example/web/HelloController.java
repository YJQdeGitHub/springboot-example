package com.example.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author yangjunqi
 * @Date 2021/1/21 17:51
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Locale locale, Model model) {
        return "Hello World";
    }
}
