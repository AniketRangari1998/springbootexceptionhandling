package com.exceptionhandling.exceptionhandlingdemo.service;

import com.exceptionhandling.exceptionhandlingdemo.entity.Employee;
import com.exceptionhandling.exceptionhandlingdemo.repository.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpServiceImpl implements EmpService{

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee saveEmployee(Employee e) {
        return employeeRepo.save(e);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepo.findById(id);
    }


}
