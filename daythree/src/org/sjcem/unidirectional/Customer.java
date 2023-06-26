package org.sjcem.unidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
	//private data members
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custId;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	//default constructor
	public Customer() {
		System.out.println("One-to-one unidirectional");
	}

	//parameterized constructor
	public Customer(int custId, String name, Address address) {
		super();
		this.custId = custId;
		this.name = name;
		this.address = address;
	}

	//getters and setters
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	//toString method
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
}
