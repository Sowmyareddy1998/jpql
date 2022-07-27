package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.repository.EmpRepo;
import com.example.service.EmpService;
import com.example.serviceImp.EmpServiceImp;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

@RestController
public class EmpController {

	@Autowired
	private EmpService empservice;
	
	@Autowired
	private EmpRepo emprepo;
	
	
	@PostMapping("/save")
	public ResponseEntity<?> saveEmployee(@RequestBody Employee emp){
		
	
		 empservice.saveEmp(emp);
	return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("/employees/{firstname}")
    public List<Employee> findByFirstName(@PathVariable("firstname") String firstname){
        return empservice.getByFirstName(firstname);

    }
	
	@GetMapping("/employee/{department}")
    public List<Employee> findByDepartment(@PathVariable("department") String department){
        return empservice.getByDepartment(department);

    }
	
	@GetMapping("/employe/{firstname}/{department}")
    public List<Employee> findByFirstNameAndDepartment(@PathVariable("firstname") String firstname,@PathVariable("department") String department){
        return empservice.getByFirstNameAndDepartment(firstname,department);

    }
	}
