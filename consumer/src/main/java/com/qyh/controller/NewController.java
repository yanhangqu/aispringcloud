package com.qyh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new")
public class NewController {


    @GetMapping("/new")
    public String git(){
        System.out.println("=============新增的代码==============");
        return "new test";
    }


}
