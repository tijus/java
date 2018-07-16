package com.emp;
import java.util.Date;
public class Employee
{
	protected int id,sal;
	protected String name;
	protected Date joining;

	public Employee(){}
	public Employee(int id,String name,int sal,Date joining){
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.joining=joining;
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
	public void setJoining(Date joining)
	{
		this.joining=joining;
	}
	public Date getJoining()
	{
		return joining;
	}
	public String toString()
	{
		return id+"\t"+name+"\t"+sal+"\t"+joining+"\n";
	}
}


/*
set java_home=C:\Java\jdk1.6.0

set classpath=%classpath%;hibernate3.jar;.;

set path=C:\Java\jdk1.6.0\bin

javac -d . *.java
===========================================================================
create table emp_master1(
empid int, empname varchar(20), empsal int, empdate datetime);


select * from emp_master1
alter table emp_master1
modify empname varchar(20)

drop table emp_master1
*/