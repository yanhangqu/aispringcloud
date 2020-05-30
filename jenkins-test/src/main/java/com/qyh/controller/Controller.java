package com.qyh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class Controller {

    @GetMapping("/jenkinsTest")
    public String jenkinsTest(){
        return "this is jenkins";
    }
}
