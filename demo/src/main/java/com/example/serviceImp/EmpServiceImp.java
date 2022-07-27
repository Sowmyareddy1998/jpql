package com.example.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmpRepo;
import com.example.service.EmpService;
@Service
public class EmpServiceImp implements EmpService {
	
	@Autowired
	private EmpRepo emprepo;

	@Override
	public void saveEmp(Employee employee) {
		emprepo.save(employee);
		 
		
		}

	@Override
	public List<Employee> getByFirstName(String firstname) {
	
		return emprepo.findByFirstName(firstname);
	}

	@Override
	public List<Employee> getByDepartment(String department) {
		
		return emprepo.findByDepartment(department);

	}

	@Override
	public List<Employee> getByFirstNameAndDepartment(String firstname, String department) {
		
		return emprepo.findByFirstNameAndDepartment(firstname, department);
	}


}
