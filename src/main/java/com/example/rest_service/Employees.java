package com.example.rest_service;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Employees {
    private List<Employee> employeeList = new ArrayList<>();
}
