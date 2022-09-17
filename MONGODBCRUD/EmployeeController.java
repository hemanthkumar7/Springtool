package com.example.MongoCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MongoCRUD.model.Employee;
import com.example.MongoCRUD.service.EmployeeService;

@RestController
public class EmployeeController {
 
@Autowired
private EmployeeService employeeService;



@PostMapping
public ResponseEntity<Employee> saveOrUpdate (@RequestBody Employee emp){
	
	return new ResponseEntity<Employee>(employeeService.saveOrUpdate(emp),HttpStatus.ACCEPTED);
}

@GetMapping 
public ResponseEntity<List<Employee>> findAll(){
	return new ResponseEntity<List<Employee>>(employeeService.findAll(),HttpStatus.ACCEPTED);
}

@DeleteMapping
public ResponseEntity<String> delete(@RequestBody Employee emp){
	employeeService.delete(emp);
	return new ResponseEntity<String>("Record deleted",HttpStatus.ACCEPTED);
}
}
