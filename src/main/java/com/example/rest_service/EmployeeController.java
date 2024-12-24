package com.example.rest_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EmployeeController {
    private final EmployeeManager employeeManager;

    @Autowired
    public EmployeeController(EmployeeManager employeeManager){
        this.employeeManager = employeeManager;
    }

    @GetMapping("/employees")
    public Employees getEmployees(){
        return employeeManager.getEmployees();
    }
}
