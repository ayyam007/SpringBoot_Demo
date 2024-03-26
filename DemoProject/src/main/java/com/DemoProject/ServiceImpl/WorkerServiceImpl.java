package com.DemoProject.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.DemoProject.Entity.WorkerEntity;
import com.DemoProject.Repository.WorkerRepository;
import com.DemoProject.Service.WorkerService;

@Service
public class WorkerServiceImpl implements WorkerService{
	
	@Autowired
	WorkerRepository workRepo;

	@Override
	public WorkerEntity addWorker(WorkerEntity wk) {
		 WorkerEntity addWorker = workRepo.save(wk);
		return addWorker;
	}

	
	public WorkerEntity getWorker(@PathVariable int id) {
		WorkerEntity getWorker = workRepo.findById(id).get();
		return getWorker;
	}


	

	public WorkerEntity updateWorker(@RequestBody WorkerEntity wk, @PathVariable int workerId) {
		WorkerEntity updateWorker = workRepo.findById(workerId).get();
		updateWorker.setWorkerAge(wk.getWorkerAge());
		workRepo.save(wk);
		return updateWorker;
		
	}


	public String deleteWorker(@PathVariable int workerId) {
		workRepo.deleteById(workerId);
		return "Successfully Deleted" ;
	}





	@Override
	public List<WorkerEntity> findAllWorker(WorkerEntity wk) {
		List<WorkerEntity> findAllWorker = workRepo.findAll();
		return findAllWorker;
	}



	}


