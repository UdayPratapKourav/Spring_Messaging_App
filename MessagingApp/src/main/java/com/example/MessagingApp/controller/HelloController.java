package com.example.MessagingApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController  // Marks this as a REST API Controller
@RequestMapping("/api") // Base URL for all endpoints
public class HelloController {

    // GET Method - Responds with a message
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }


}