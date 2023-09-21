package com.shiva.service;

import java.util.List;

import com.shiva.entity.Employee;
import com.shiva.exception.EmployeeNotFoundException;
import com.shiva.model.EmployeeRest;

public interface EmpService {
	public Employee saveEmployee(EmployeeRest empRequest);
	public List<Employee> getAllEmployees();
	
    public Employee getEmployee(int id)throws EmployeeNotFoundException;


}
