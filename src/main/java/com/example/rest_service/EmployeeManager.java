package com.example.rest_service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager {
    private final Employees employees;

    public EmployeeManager(){
        employees = new Employees();
        employees.setEmployeeList(List.of(
                new Employee(1, "John", "Doe", "john.doe@example.com", "Developer"),
                new Employee(2, "Jane", "Smith", "jane.smith@example.com", "Manager"),
                new Employee(3, "Alice", "Johnson", "alice.johnson@example.com", "Designer"),
                new Employee(4, "Bob", "Brown", "bob.brown@example.com", "Analyst")
        ));
    }

    public Employees getEmployees(){
        return employees;
    }
}
