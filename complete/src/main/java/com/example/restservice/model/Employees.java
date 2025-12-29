package com.example.restservice.model;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList;

    public Employees() {
        this.employeeList = new ArrayList<>();
    }

    public List<Employee> getEmployeeList() {
        return this.employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}