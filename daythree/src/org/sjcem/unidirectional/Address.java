package org.sjcem.unidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {

	//private data members
	@Id
	private int pincode;
	private String city;
	private String area;
	
	//default constructor
	public Address() {
		
	}
	
	//parameterized constructor
	public Address(int pincode, String city, String area) {
		super();
		this.pincode = pincode;
		this.city = city;
		this.area = area;
	}
	
	//getters and setters
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	//ToString Method
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", area=" + area + "]";
	}
	
	
	
	
}
