package com.emp;
public class Employee
{
	protected int id;
	protected int sal;
	protected String name;

	public Employee()
	{
	}
	public Employee(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public void setId(int id)
	{
		this.id=id;
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


/*create table emp_master(empid int, empname varchar(20),empsal int)

select * from emp_master */