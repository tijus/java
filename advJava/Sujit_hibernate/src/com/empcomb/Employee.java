package com.empcomb;

public class Employee {
	protected int id;
	protected String firstname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	protected String lastname;
	protected int sal;
	
	public Employee()
	{
		
	}
	public Employee(String firstname, String lastname, int sal)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.sal=sal;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	

}
