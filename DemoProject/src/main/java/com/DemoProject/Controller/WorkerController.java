package com.DemoProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DemoProject.Entity.WorkerEntity;
import com.DemoProject.Service.WorkerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/workerDetails")
public class WorkerController {
	@Autowired
	WorkerService wrksvc;
	
	//create
	@PostMapping("/add")
	public WorkerEntity addWorker(@RequestBody WorkerEntity w) {
		
		WorkerEntity new_Add = wrksvc.addWorker(w);
		
		return new_Add;
	}
	//Read
	@GetMapping("/show/{id}")
	public WorkerEntity showWorker(@PathVariable int id) {
		WorkerEntity show = wrksvc.getWorker(id);
		return show;
	}
	
	//update
	@PostMapping("/update/{workerId}")
	public WorkerEntity updateWorker(@RequestBody WorkerEntity wk, @PathVariable int workerId) {
		
		WorkerEntity update = wrksvc.updateWorker(wk, workerId);
		
		return update;
	}
	//delete
	@GetMapping("/delete/{id}")
	public String deleteWorker(@PathVariable int id) {
		
		return wrksvc.deleteWorker(id);
	}
	
	//find All
	@GetMapping("/findAll")
	public List<WorkerEntity> findAllWorker(WorkerEntity wk) {
		List<WorkerEntity> find=wrksvc.findAllWorker(wk);
		return find;
	}
	
	
	
	

}
