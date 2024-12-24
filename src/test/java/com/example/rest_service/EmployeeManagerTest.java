package com.example.rest_service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class EmployeeManagerTest {


    @Mock
    Employees employees;


    @Spy
    @InjectMocks
    EmployeeManager employeeManager;

    @BeforeEach
    public void init(){
        when(employees.getEmployeeList()).thenReturn(new ArrayList<>(List.of(
                new Employee(1, "John", "Doe", "john.doe@example.com", "Developer"),
                new Employee(2, "Jane", "Smith", "jane.smith@example.com", "Manager")
        )));
    }
    @Test
    void getEmployees() {
        List<Employee> testEmployees = new ArrayList<>(List.of(
                new Employee(1, "John", "Doe", "john.doe@example.com", "Developer"),
                new Employee(2, "Jane", "Smith", "jane.smith@example.com", "Manager")
        ));
        when(employeeManager.getEmployees().getEmployeeList()).thenReturn(testEmployees);

        assertThat(employeeManager.getEmployees().getEmployeeList()).hasSize(2);
        assertThat(employeeManager.getEmployees().getEmployeeList().get(0).getFirst_name()).isEqualTo("John");
        assertThat(employeeManager.getEmployees().getEmployeeList().get(1).getFirst_name()).isEqualTo("Jane");

    }

    @Test
    void addEmployees() {
        Employee employee = new Employee(3, "Alice", "Johnson", "alice.johnson@example.com", "Designer");
        employeeManager.addEmployees(employee);
        Mockito.verify(employeeManager, Mockito.times(1)).addEmployees(employee);
        assertThat(employeeManager.getEmployees().getEmployeeList()).hasSize(3);
        assertThat(employeeManager.getEmployees().getEmployeeList().contains(employee));
    }
}