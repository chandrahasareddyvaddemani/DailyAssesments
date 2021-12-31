package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleMicroControler {
    @GetMapping("/greeting1")
    public String greeting1() {
        return "Wel Come to Microservices";
    }
    @Value("${myname}")  // placeholder
    //@Value("Tarkeshwar Barua")
    private String name;

    @GetMapping("/greeting")
    public String greeting() {
        return name + "Wel Come to Microservices";
    }

}
