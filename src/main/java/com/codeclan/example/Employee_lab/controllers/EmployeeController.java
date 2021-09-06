package com.codeclan.example.Employee_lab.controllers;

import com.codeclan.example.Employee_lab.Model.Employee;
import com.codeclan.example.Employee_lab.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/employees")
    public List <Employee> getAllEmployees(){
        
    }
}
