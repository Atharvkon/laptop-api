package com.example.laptop_api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contoller{ @GetMapping("/greet")
    public String greet(String name){return "Hello "+name;
    }
}