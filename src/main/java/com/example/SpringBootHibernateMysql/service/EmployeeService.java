package com.example.SpringBootHibernateMysql.service;

import com.example.SpringBootHibernateMysql.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public Employee save(Employee employee);
    public List<Employee> findAll();

    public Employee update(Employee employee);

    public Employee findByEmail(String email);

    Employee findByName(String name);
}
