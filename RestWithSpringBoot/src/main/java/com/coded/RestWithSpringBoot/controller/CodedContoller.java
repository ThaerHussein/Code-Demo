package com.coded.RestWithSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coded")
public class CodedContoller {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello from coded";
    }
}
