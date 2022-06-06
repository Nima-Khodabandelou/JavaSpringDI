package com.autotradingwiz.JavaSpringDI.controllers;

import com.autotradingwiz.JavaSpringDI.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
