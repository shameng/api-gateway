package com.meng.apigateway.controller;

import com.netflix.zuul.context.RequestContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author meng
 * @create 2017-12-21 11:49
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello, Zuul";
    }
}
