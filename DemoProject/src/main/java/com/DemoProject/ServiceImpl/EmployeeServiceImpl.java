package com.DemoProject.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DemoProject.Entity.EmployeeEntity;
import com.DemoProject.Repository.EmployeeRepository;
//import com.DemoProject.Service.EmployeeEntity;
import com.DemoProject.Service.EmployeeService;
//import com.DemoProject.Service.EmpolyeeEntity;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	EmployeeRepository repo ;
	public EmployeeEntity createnew(int user) {
		// TODO Auto-generated method stub
		
		return repo.findById(user).get();
	}
	@Override
	public EmployeeEntity addEmployee(EmployeeEntity emp) {
		// TODO Auto-generated method stub
		EmployeeEntity addEmp = repo.save(emp);
		return addEmp;
	}
	
	

}
