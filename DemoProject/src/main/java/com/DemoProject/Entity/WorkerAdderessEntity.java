package com.DemoProject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="workeraddress")
public class WorkerAdderessEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int addressId;
	private String workerCity;
	private String workerState;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getWorkerCity() {
		return workerCity;
	}
	public void setWorkerCity(String workerCity) {
		this.workerCity = workerCity;
	}
	public String getWorkerState() {
		return workerState;
	}
	public void setWorkerState(String workerState) {
		this.workerState = workerState;
	}

	
}
