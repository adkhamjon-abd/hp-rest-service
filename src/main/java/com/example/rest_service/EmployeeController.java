package com.example.rest_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class EmployeeController {
    private final EmployeeManager employeeManager;

    @Autowired
    public EmployeeController(EmployeeManager employeeManager){
        this.employeeManager = employeeManager;
    }

    @GetMapping("employees")
    public Employees getEmployees(){
        return employeeManager.getEmployees();
    }

    @PostMapping("/add")
    public void addEmployees(@RequestBody Employee employee){
        employeeManager.addEmployees(employee);
        System.out.println("Successfully added");
    }
}
