package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String sendGreetings() {
        return "<html><body style='background-color:grey;text-align: center;'> <h1 style='background-color:powderblue;'> Hello, World!</h1> </br>Java 17 is the latest long-term support (LTS) release</body></html>";
    }
}
