package com.example.restservice.repository;

import org.springframework.stereotype.Repository;

import com.example.restservice.model.Employee;
import com.example.restservice.model.Employees;

@Repository
public class EmployeeManager {
    private final Employees employees;

    public EmployeeManager() {
        employees = new Employees();

        employees.getEmployeeList().add(
                new Employee("emp_1", "Andi", "Farhan", "andi@gmail.com", "Backend Engineer"));

        employees.getEmployeeList().add(
                new Employee("emp_2", "Budi", "Santoso", "budi@gmail.com", "Frontend Engineer"));

        employees.getEmployeeList().add(
                new Employee("emp_3", "Asep", "Jamal", "asep@gmail.com", "Software Engineer"));
    }

    public Employees getEmployees() {
        return employees;
    }
}
