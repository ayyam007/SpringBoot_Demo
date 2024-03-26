package com.DemoProject.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DemoProject.Entity.EmployeeEntity;
import com.DemoProject.Repository.EmployeeRepository;
import com.DemoProject.Service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping("/Emp")
public class EmployeeController {
	@Autowired
	EmployeeRepository empRepo;
	
	@Autowired
	EmployeeService empsvc;
	
	//@PostMapping("/create")
//	public EmployeeEntity createEmployee(@RequestBody EmployeeEntity eE) {
//		//TODO: process POST request
//		  EmployeeEntity addEmployee = empRepo.save(eE);
//		
//		return addEmployee;
//	}
	
	@PostMapping("/create")
	public EmployeeEntity postEmployee(@RequestBody EmployeeEntity Emp) {
		//TODO: process POST request
		EmployeeEntity emp=empsvc.addEmployee(Emp);
		
		return emp;
	}
	

	
	//FindAll data
	@GetMapping("/findall")
	public List<EmployeeEntity> getFindAllEmployee() {
		List<EmployeeEntity> listOfEmployee = empRepo.findAll();
		return listOfEmployee;
	}

	
	
	
	//findByID
	
//	@GetMapping("/getEmp/{id}")
//	public EmployeeEntity em(@PathVariable int id)
//	
//	{
//		EmployeeEntity getEmp = empRepo.findById(id).get();
//		return getEmp;
//	}
//	
//	public ResponseEntity<?> em(@PathVariable int id){
//		EmployeeEntity getEmp = empRepo.findById(id).get();
//		return ResponseEntity.status(HttpStatus.OK).body(getEmp);
//	}
	
	
	//update
	@PostMapping("/update/{id}")
	public EmployeeEntity update(@RequestBody EmployeeEntity E,@PathVariable int id) {
		EmployeeEntity e = empRepo.findById(id).get();
		e.setEmployeeAge(E.getEmployeeAge());
		empRepo.save(E);
		return e;
	}

	
	//Delete
	
	@GetMapping("/delete/{id}")
	public String deleteEmp(@PathVariable int id) {
		empRepo.deleteById(id);
		return "Successfully Deleted";
				
	}
	
	//Query
	@GetMapping("/userdata/{name}/{age}")
	public EmployeeEntity getMethodName(@PathVariable String name,@PathVariable int age) {
		EmployeeEntity ee = empRepo.getEmpByName(name, age);
		return ee;
	}
	@GetMapping("/getEmp/{id}")
	public EmployeeEntity em(@PathVariable int id)
	
	{
		EmployeeEntity us = empsvc.createnew(id);
		return us;
	}
	
	

	
	

}
