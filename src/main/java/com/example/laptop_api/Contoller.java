package com.example.laptop_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** REST controller that handles greeting-related endpoints. */
@RestController
public class Contoller {

  /**
   * Returns a greeting message for the given name.
   *
   * @param name the name of the person to greet
   * @return a greeting string containing the provided name
   */
  @GetMapping("/greet")
  public String greet(String name) {
    String greeting = "Hello " + name;
    return greeting;
  }
}
