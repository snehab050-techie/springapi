package com.apitesting.springapi.service;

import java.util.List;

import com.apitesting.springapi.dto.StudentDto;

public interface StudentService {
    List<StudentDto> getAllStudents();
}
