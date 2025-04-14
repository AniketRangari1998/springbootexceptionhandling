package com.exceptionhandling.exceptionhandlingdemo.controller;


import com.exceptionhandling.exceptionhandlingdemo.entity.Employee;
import com.exceptionhandling.exceptionhandlingdemo.entity.ErrorResponse;
import com.exceptionhandling.exceptionhandlingdemo.exception.EmployeeNotFoundException;
import com.exceptionhandling.exceptionhandlingdemo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee e){
        return empService.saveEmployee(e);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return empService.getEmployees();
    }

//    @GetMapping("/employees/{id}")
//    public ResponseEntity<?> getEmpById(@PathVariable int id){
//
//        try{
//            Employee e = empService.getEmployeeById(id).orElseThrow(()-> new EmployeeNotFoundException("Employee Not Found " + id));
//
//            return new ResponseEntity<>(e, HttpStatus.NOT_FOUND);
//        }catch (EmployeeNotFoundException e){
//            ErrorResponse employeeNotFound = new ErrorResponse(
//                    LocalDateTime.now(), e.getMessage(), "Employee Not Found"
//            );
//
//            return new ResponseEntity<>(employeeNotFound, HttpStatus.NOT_FOUND);
//        }
//
//    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<?> getEmpById(@PathVariable int id){

            Employee e = empService.getEmployeeById(id).orElseThrow(()-> new EmployeeNotFoundException("Employee Not Found " + id));

            return new ResponseEntity<>(e, HttpStatus.NOT_FOUND);
    }

//    @ExceptionHandler(EmployeeNotFoundException.class)
//    public ResponseEntity<?> handleEmployeeNotFoundException(EmployeeNotFoundException exception){
//        ErrorResponse employeeNotFound = new ErrorResponse(
//                LocalDateTime.now(), exception.getMessage(), "Employee Not Found"
//        );
//        return new ResponseEntity<>(employeeNotFound, HttpStatus.NOT_FOUND);
//    }

    @GetMapping("/appentry")
     public String appEntry(){
        return "This is Spring Boot Application" ;
     }

}

























































