package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {


    @GetMapping("tester")
    public String tester() {
        return "hello world";
    }


    @PostMapping("python")
    public String python() {
        return "hello world from python";
    }
}
