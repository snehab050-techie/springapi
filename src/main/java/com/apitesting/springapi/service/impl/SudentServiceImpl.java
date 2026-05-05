package com.apitesting.springapi.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.apitesting.springapi.dto.StudentDto;
import com.apitesting.springapi.entity.Student;
import com.apitesting.springapi.repository.StudentRepository;
import com.apitesting.springapi.service.StudentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    
    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        // List<StudentDto> studentDtos
        return students.stream().map(student -> new StudentDto(student.getId(), student.getName(),student.getEmail())).toList();
        // return studentDtos;
    }

}
