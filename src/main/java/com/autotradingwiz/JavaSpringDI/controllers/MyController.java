package com.autotradingwiz.JavaSpringDI.controllers;
import com.autotradingwiz.JavaSpringDI.services.GreetingService;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
