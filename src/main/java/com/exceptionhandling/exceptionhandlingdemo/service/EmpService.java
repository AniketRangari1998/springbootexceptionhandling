package com.exceptionhandling.exceptionhandlingdemo.service;


import com.exceptionhandling.exceptionhandlingdemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmpService {

    public Employee saveEmployee(Employee e);

    public List<Employee> getEmployees();

    public Optional<Employee> getEmployeeById(int id);

}
