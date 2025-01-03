package com.example.rest_service;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    //Step 3: Create a resource class for the Employee that includes private variables for
    // employee_id, first_name, last_name, email, and title. Also include getter functions
    // for each variable.
    private int employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String title;
}
