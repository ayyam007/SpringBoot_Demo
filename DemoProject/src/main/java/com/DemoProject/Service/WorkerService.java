package com.DemoProject.Service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.DemoProject.Entity.WorkerEntity;

public interface WorkerService {
	WorkerEntity addWorker(WorkerEntity wk);
	WorkerEntity getWorker(@PathVariable int id);
	List<WorkerEntity> findAllWorker(WorkerEntity wk);
	WorkerEntity updateWorker(@RequestBody WorkerEntity wk, @PathVariable int workerId);
	String deleteWorker(@PathVariable int workerId);

}
