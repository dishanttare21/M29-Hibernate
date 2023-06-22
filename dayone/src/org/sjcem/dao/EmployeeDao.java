package org.sjcem.dao;

import org.sjcem.entities.Employee;

public interface EmployeeDao {

	//by default abstract method
	//User defined methods for CRUD operations
	void addEmployee(Employee emp); //create
	Employee getEmployee(int id); //retrieve
	void updateEmployee(Employee emp); //update
	void deleteEmployee(Employee emp); //delete
	
	//JPA transaction
	void beginTransaction(); //begin
	void commitTransaction(); //close
	
}
