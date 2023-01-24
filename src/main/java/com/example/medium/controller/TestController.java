package com.example.medium.controller;

import org.springframework.stereotype.Controller;

@Controller
//@RequestMapping("/")
public class TestController {


   // @GetMapping()
    public  String something(){
        return "home";
    }

}
