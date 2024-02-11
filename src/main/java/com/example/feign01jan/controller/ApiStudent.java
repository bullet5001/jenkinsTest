package com.example.feign01jan.controller;

import com.example.feign01jan.dto.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiStudent {
    @GetMapping("/get")
    public Student getStudent(){
        return Student.builder()
                .firstName("Bhupain")
                .lastName("joshi")
                .build();
    }

}
