package com.apitesting.springapi.dto;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class StudentDto{

    private int id;
    private String name;
    private String email;
    
}