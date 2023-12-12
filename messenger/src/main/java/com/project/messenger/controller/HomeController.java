package com.project.messenger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final LoggingController logger;

    @Autowired
    public HomeController(LoggingController logger) {
        this.logger = logger;
    }

    @GetMapping("/")
    public String index() {
        return "M0001";
    }
}
