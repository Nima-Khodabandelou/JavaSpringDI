package com.autotradingwiz.JavaSpringDI.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hi everybody!");

        return "Hi Folks!";
    }
}
