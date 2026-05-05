package com.apitesting.springapi.controller;

import org.springframework.web.bind.annotation.RestController;

import com.apitesting.springapi.dto.StudentDto;
import com.apitesting.springapi.entity.Student;
import com.apitesting.springapi.repository.StudentRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class StudentController {

    //Here we are directly using the repository in the controller, which is not a good practice. 
    // Communicating directly from presentation layer to data access or persistence layer is not a good practice.
    // We should use a service layer to handle the business logic and then call the repository from the service layer. 
    private final StudentRepository studentRepository;
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    @GetMapping("/student/{id}")
    public StudentDto getStudentById(){
        return new StudentDto(102,"Suhas Kaggal","suhas@gmail.com");
    }
    
}