package com.DemoProject.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DemoProject.Entity.StudentEntity;
import com.DemoProject.Repository.StudentRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/studentDetails")
public class StudentController {
	@GetMapping("/std")
	public String Create() {
		return "Hello Student:";
	}
	
	@GetMapping("/stdId")
	public String stdId() {
		return "16SuIT01";
		
	}
	@Autowired
	StudentRepository stdRepo;
	@PostMapping("/student")
	public String std(@RequestBody StudentEntity stu) {
		stdRepo.save(stu);
		return "sucess";
		
	}
	
	@GetMapping("/get")
	public List<StudentEntity> getStudentData(){
		return stdRepo.findAll();
	}

}
