package com.example.restservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.restservice.controller.EmployeeController;
import com.example.restservice.model.Employees;
import com.example.restservice.repository.EmployeeManager;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeManager employeeManager;

    @Test
    void shouldReturn200WhenGetEmployees() throws Exception {
        when(employeeManager.getEmployees()).thenReturn(new Employees());

        mockMvc.perform(get("/employees")).andExpect(status().isOk());
    }
}
