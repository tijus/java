package com.emp;

public class Employee {
	protected int id;
	protected int sal;
	protected String name;
	protected String address;

	public Employee()
	{
	}
	public Employee(int id,String name,int sal,String address)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.address=address;
	}
	public Employee(String firstname, String lastname, int sal2) {
		// TODO Auto-generated constructor stub
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getSal()
	{
		return sal;
	}
	public String toString()
	{
		return id+"\t"+name+"\t"+sal;
	}

}
