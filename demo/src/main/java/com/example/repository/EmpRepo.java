package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.Employee;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;
@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {
	
	
	  //JPQL with named parameters
    @Query("SELECT e from Employee e where e.firstname=:firstname ")
    List<Employee> findByFirstName(@Param("firstname") String firstName);
    
    @Query("SELECT e from Employee e where e.department=:department")
    List<Employee> findByDepartment(@Param("department") String department);
    
    @Query("SELECT e from Employee e where e.firstname=?1 and e.department=?2")
    List<Employee> findByFirstNameAndDepartment(String firstname,String department);
    
    

	

}
