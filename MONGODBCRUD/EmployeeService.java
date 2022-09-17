package com.example.MongoCRUD.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.MongoCRUD.model.Employee;
import com.example.MongoCRUD.repository.EmployeeRepository;

@Service
public class EmployeeService {

@Autowired
private EmployeeRepository employeeRepository;


	public Employee saveOrUpdate(Employee emp) {
		return employeeRepository.save(emp);
	}
  public List<Employee> findAll(){
	  return employeeRepository.findAll();
  }
  
  public void delete(Employee emp) {
	  employeeRepository.delete(emp);
  }
}
