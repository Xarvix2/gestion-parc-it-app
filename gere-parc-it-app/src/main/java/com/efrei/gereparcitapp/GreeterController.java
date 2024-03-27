package com.efrei.gereparcitapp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {
    
    @GetMapping("/hello")
    public String sayHello() {
        String name = "Noah"; 
        return "Hello " + name + "!";
    }
}
