package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persons {
	@Id
	private Integer personID;
	private String lastName;
	private String firstName;
	private String city;
	public Integer getPersonID() {
		return personID;
	}
	public void setPersonID(Integer personID) {
		this.personID = personID;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Persons [personID=" + personID + ", lastName=" + lastName + ", firstName=" + firstName + ", city="
				+ city + "]";
	}
	
	
}
