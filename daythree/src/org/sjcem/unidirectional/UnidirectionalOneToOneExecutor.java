//Program to demonstrate on one-to-one unidirectional association
//driver class
package org.sjcem.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UnidirectionalOneToOneExecutor {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create customer 1
		Customer c1 = new Customer();
		c1.setName("Abhinav");
		
		Address a1 = new Address();
		a1.setPincode(440022);
		a1.setCity("Nagpur");
		a1.setArea("Mahadev Nagar");
		
		c1.setAddress(a1);
		em.persist(c1);

		
		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();
	}

}
