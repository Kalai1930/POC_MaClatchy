package com.MemCache.Pojo;

import java.io.Serializable;
import java.sql.Date;

public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3566484389313347929L;
	private int rollNo;
	private String firstName;
	private String lastName;
	private Date dob;
	private String gender;
	private int address_key;
	
	public Student(){
		super();
	}
public Student(int rollNo,String firstName,String lastName,Date dob,String gender,int address_key){
	this.rollNo = rollNo;
	this.firstName = firstName;
	this.lastName = lastName;
	this.dob = dob;
	this.gender = gender;
	this.address_key = address_key;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAddress_key() {
	return address_key;
}
public void setAddress_key(int address_key) {
	this.address_key = address_key;
}

}