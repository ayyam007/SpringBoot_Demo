package com.DemoProject.Service;

import com.DemoProject.Entity.EmployeeEntity;

public interface EmployeeService {
	EmployeeEntity createnew(int user);
	
	EmployeeEntity addEmployee(EmployeeEntity emp);

}
