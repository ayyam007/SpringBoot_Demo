package com.DemoProject.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="worker")
public class WorkerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int workerId;
	private String workerName;
	private int workerAge;
	private double workerSalary;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="addressId")
	private WorkerAdderessEntity addEntity;
	public WorkerAdderessEntity getAddEntity() {
		return addEntity;
	}
	public void setAddEntity(WorkerAdderessEntity addEntity) {
		this.addEntity = addEntity;
	}
	public int getWorkerId() {
		return workerId;
	}
	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}
	public String getWorkerName() {
		return workerName;
	}
	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}
	public int getWorkerAge() {
		return workerAge;
	}
	public void setWorkerAge(int workerAge) {
		this.workerAge = workerAge;
	}
	public double getWorkerSalary() {
		return workerSalary;
	}
	public void setWorkerSalary(double workerSalary) {
		this.workerSalary = workerSalary;
	}
	
	
	

}
