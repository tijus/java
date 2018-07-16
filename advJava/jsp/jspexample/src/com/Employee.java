package com;

public class Employee implements java.io.Serializable {
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	/*
	 * Three rules for using java beans class
	 *  1.  implement Serializable interface
	 *  2. presence of default constructor
	 *  3. presence of respective getters and setters
	 *  
	 * */
	private String firstname;
	private String lastname;
	private int age = 0;
	
	public Employee()
	{
		
	}	
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	}


