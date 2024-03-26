package com.DemoProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.DemoProject.Entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{
	@Query("select emp from EmployeeEntity emp where emp.employeeName=?1 and emp.employeeAge=?2")
	EmployeeEntity getEmpByName(String empName,int empAge);


}
