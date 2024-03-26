package com.DemoProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DemoProject.Entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
