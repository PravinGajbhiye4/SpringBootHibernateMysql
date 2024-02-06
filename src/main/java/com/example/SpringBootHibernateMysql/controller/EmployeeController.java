package com.example.SpringBootHibernateMysql.controller;


import com.example.SpringBootHibernateMysql.model.Employee;
import com.example.SpringBootHibernateMysql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee){

        return employeeService.save(employee);
    }

    @GetMapping("/findAll")
    public List<Employee> findAll(){
        return  employeeService.findAll();
    }

    @PutMapping("/update")
    public Employee update(@RequestBody  Employee employee)
    {
       return employeeService.save(employee);
    }

    @GetMapping("/findByEmail/{email}")
    public Employee findByEmail(@PathVariable String email){
        return employeeService.findByEmail(email);
    }

    @GetMapping("/findByName")
    public Employee findByName(@RequestParam("name") String name){
        return employeeService.findByName(name);
    }

    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}
