package com.example.MongoCRUD.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.MongoCRUD.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
	

}
