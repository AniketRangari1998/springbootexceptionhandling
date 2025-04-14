package com.exceptionhandling.exceptionhandlingdemo.controller;

import com.exceptionhandling.exceptionhandlingdemo.entity.ErrorResponse;
import com.exceptionhandling.exceptionhandlingdemo.exception.EmployeeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<?> handleEmployeeNotFoundException(EmployeeNotFoundException exception){
        ErrorResponse employeeNotFound = new ErrorResponse(
                LocalDateTime.now(), exception.getMessage(), "Employee Not Found"
        );
        return new ResponseEntity<>(employeeNotFound, HttpStatus.NOT_FOUND);
    }
}
