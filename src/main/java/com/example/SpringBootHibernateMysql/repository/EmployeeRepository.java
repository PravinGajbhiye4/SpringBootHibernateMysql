package com.example.SpringBootHibernateMysql.repository;

import com.example.SpringBootHibernateMysql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Employee findByEmail(String email);

    Employee findByName(String name);

}
