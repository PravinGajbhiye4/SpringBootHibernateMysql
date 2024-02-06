package com.example.SpringBootHibernateMysql.service.impl;

import com.example.SpringBootHibernateMysql.model.Employee;
import com.example.SpringBootHibernateMysql.repository.EmployeeRepository;
import com.example.SpringBootHibernateMysql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee update(Employee employee) {
        Employee employee1=this.findByEmail(employee.getEmail());
        employee1.setEmail(employee.getEmail());
        employee1.setName(employee.getName());
        return employeeRepository.save(employee1);
    }

    @Override
    public Employee findByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }

    @Override
    public Employee findByName(String name) {
        return employeeRepository.findByName(name);
    }

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
}
