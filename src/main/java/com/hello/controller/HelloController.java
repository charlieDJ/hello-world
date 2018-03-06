package com.hello.controller;

import com.google.common.collect.Lists;
import com.hello.common.ServerResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ServerResponse<List<String>> sayHello(){
        return ServerResponse.createBySuccess(Lists.newArrayList("hello","myWorld","this is my","craft"));
    }
}
