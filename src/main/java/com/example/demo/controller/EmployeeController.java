package com.example.demo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class EmployeeController
{
    @GetMapping("/test")
    private ResponseEntity<String> getTest(){
        return ResponseEntity.ok("hello");
    }
}
