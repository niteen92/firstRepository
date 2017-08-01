package com.yash.model;

public class Student {
	
	private String name;
	private long contact;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public void ShowDetails()
	{
		System.out.println("Student Name: "+getName()+"\n Student Contact No "+getContact()+"\n Student Email Address is "+getEmail() );
		
	}
	

}
