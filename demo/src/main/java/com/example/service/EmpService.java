package com.example.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;

@Service
public interface EmpService {
	
	public void saveEmp(Employee employee);
	public List<Employee>  getByFirstName(String firstname);
	public List<Employee>  getByDepartment(String department);
	public List<Employee>  getByFirstNameAndDepartment(String firstname,String department);

}
