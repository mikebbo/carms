package com.globexzone.carstruckmsv2;

import org.springframework.web.bind.annotation.GetMapping;

public class ApplicationController {
    @GetMapping("/index")
    public String home(){
        return "index";
    }
    @GetMapping("/widget")
    public  String widget(){
        return "widget";
    }
}


