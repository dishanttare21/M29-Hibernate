package org.sjcem.dao;

import javax.persistence.EntityManager;

import org.sjcem.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	/* All the CRUD methods are inside EntityManager interface */
	private EntityManager em;
	
	//default constructor
	public EmployeeDaoImpl() {
		em = JPAUtil.getEntityManager();
	}

	//Create or Add
	@Override
	public void addEmployee(Employee emp) {
		em.persist(emp);
	}

	//Retrieve
	@Override
	public Employee getEmployee(int id) {
		Employee emp = em.find(Employee.class, id);
		return emp;
	}

	//Update
	@Override
	public void updateEmployee(Employee emp) {
		em.merge(emp);
	}

	//Delete
	@Override
	public void deleteEmployee(Employee emp) {
		em.remove(emp);
		
	}

	//Begin the transaction
	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

	//Close the transaction
	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

}
