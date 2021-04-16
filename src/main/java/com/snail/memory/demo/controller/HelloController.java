package com.snail.memory.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: HelloController
 * @description:
 * @author: wangf-q
 * @date: 2021-04-15 17:32
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(@RequestParam("name") String name) {
        return "Hello " + name + "!";
    }
}
