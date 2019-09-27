package com.hex.demogit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: hexuan
 * Date: 2019/9/27
 * Time: 3:30 下午
 */
@RestController
public class IndexController {

    @GetMapping("/hello")
    public String hello() {
        return "hello~~~";
    }
}
