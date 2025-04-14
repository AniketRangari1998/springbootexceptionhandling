package com.exceptionhandling.exceptionhandlingdemo.repository.repository;

import com.exceptionhandling.exceptionhandlingdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
