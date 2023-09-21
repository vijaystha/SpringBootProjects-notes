package com.shiva.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.entity.Employee;
import com.shiva.exception.EmployeeNotFoundException;
import com.shiva.model.EmployeeRest;
import com.shiva.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl service;
	
	@PostMapping("/signup")
    public ResponseEntity<Employee> saveUser(@RequestBody @Valid EmployeeRest empRequest){
        return new ResponseEntity<>(service.saveEmployee(empRequest), HttpStatus.CREATED);
    }
	
	
	@GetMapping("/fetchAll")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return ResponseEntity.ok(service.getAllEmployees());
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getUser(@PathVariable int id) throws EmployeeNotFoundException {
        return ResponseEntity.ok(service.getEmployee(id));
    }
}
	
	
	
	

