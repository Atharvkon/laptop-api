package com.example.laptop_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class Contoller
{
  @GetMapping("/greet")
  public String greet(String name) {
    String Greeting = "Hello " + name;
    return Greeting;
  }

  public void unused_method(){
  }
}