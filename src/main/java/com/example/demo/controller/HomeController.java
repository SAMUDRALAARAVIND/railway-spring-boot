package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {
    public class SampleResponse {
        public String name ;
        public Integer age ;
        public SampleResponse(String name, Integer age){
            this.name = name ;
            this.age = age ;
        }
    }

    @GetMapping("/")
    public ResponseEntity<String> home(){
        System.out.println("Actual Endpoint");
        return ResponseEntity.ok("Hello Aravind");
    }

    @GetMapping("/data")
    public SampleResponse sampleResponse(){
        return new SampleResponse("Rajesh Fake", 90);
    }
}
