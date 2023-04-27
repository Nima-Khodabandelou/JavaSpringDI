package com.autotradingwiz.JavaSpringDI.services;

import org.springframework.context.annotation.Profile;

import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hi folks in Spain!";
    }
}
