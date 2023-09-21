package com.shiva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiva.entity.Employee;
import com.shiva.exception.EmployeeNotFoundException;
import com.shiva.model.EmployeeRest;
import com.shiva.repo.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmpService {

	@Autowired
	private EmployeeRepo empRepo;
	
	@Override
	public Employee saveEmployee(EmployeeRest empRequest) {
		// TODO Auto-generated method stub
		Employee employee=Employee.build(0,empRequest.getFirstName(),empRequest.getLastName(),empRequest.getEmail(),empRequest.getMobile(),empRequest.getGender(),empRequest.getAge(),empRequest.getNationality());
		Employee empSave = empRepo.save(employee);
		return empSave;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> empRecords = empRepo.findAll();
		return empRecords;
	}

	@Override
	public Employee getEmployee(int id) throws EmployeeNotFoundException{
		// TODO Auto-generated method stub
		
		return empRepo.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee Id Is Not Exist  : " + id));
	}

}
