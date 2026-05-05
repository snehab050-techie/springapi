package com.apitesting.springapi.controller;

import org.springframework.web.bind.annotation.RestController;

import com.apitesting.springapi.dto.StudentDto;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(101,"Sneha Kaggal","sneha@gmail.com");
    }

    @GetMapping("/student/{id}")
    public StudentDto getStudentById(){
        return new StudentDto(102,"Suhas Kaggal","suhas@gmail.com");
    }
    
}