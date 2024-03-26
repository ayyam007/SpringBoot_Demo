package com.DemoProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DemoProject.Entity.WorkerEntity;

public interface WorkerRepository extends JpaRepository<WorkerEntity, Integer>{

}
