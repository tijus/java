package com.empcomb;
import java.util.*;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.empcomb.Employee;
public class ManageEmployee {
	private static SessionFactory factory;
	public static void main(String args[])
	{
		try
		{
			factory=new Configuration().configure().buildSessionFactory();
		}
		catch(Throwable ex)
		{
			System.out.println("Failed to create session factory object"+ex);
			throw new ExceptionInInitializerError(ex);
		}
		ManageEmployee ME=new ManageEmployee();
		Integer empID1=ME.addEmployee("Sujit","Singh",10000);
		Integer empID2=ME.addEmployee("Sandeep","Kulkarni",20000);
		Integer empID3=ME.addEmployee("Akshay","Bora",30000);
		
		ME.listEmployee();
		ME.updateEmployee(empID1,5000);
		ME.deleteEmployee(empID2);
		ME.listEmployee();
		
	}
	public Integer addEmployee(String firstname, String lastname, int sal)
	{
		Session session=factory.openSession();
		Transaction tx=null;
		Integer employeeId=null;
		try
		{
			tx=session.beginTransaction();
			Employee employee=new Employee(firstname,lastname,sal);
			employeeId=(Integer)session.save(employee);
			tx.commit();
			System.out.println("Record Inserted...");
		}catch(HibernateException e)
		{
			//if the commit is not taken then rollback
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		
		}
		finally{
			session.close();
		}
		
		return employeeId;
		
	}
	public void listEmployee()
	{
		Session session=factory.openSession();
		Transaction tx=null;
		try
		{
			tx=session.beginTransaction();
			List employees=session.createQuery("From Employee").list();
			for(Iterator itr=employees.iterator(); itr.hasNext();)
			{
				Employee employee=(Employee)itr.next();
				System.out.println("Firstname"+employee.getFirstname());
				System.out.println("Firstname"+employee.getLastname());
				System.out.println("Firstname"+employee.getSal());
				
			}
			tx.commit();
			System.out.println("Record Listed...");
			}
		
		catch(HibernateException e)
		{
			//if the commit is not taken then rollback
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		
		}
		finally{
			session.close();
		}
	}
	public void updateEmployee(Integer EmployeeID, int sal)
	{
		Session session=factory.openSession();
		Transaction tx=null;
		try
		{
			tx=session.beginTransaction();
			Employee employee=(Employee) session.get(Employee.class, EmployeeID);
			employee.setSal(sal);
			session.update(employee);
			tx.commit();
			System.out.println("Record Updated...");
			}
		
		catch(HibernateException e)
		{
			//if the commit is not taken then rollback
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		
		}
		finally{
			session.close();
		}
		
	}
	public void deleteEmployee(Integer EmployeeID)
	{
		Session session=factory.openSession();
		Transaction tx=null;
		try
		{
			tx=session.beginTransaction();
			Employee emp=(Employee)session.get(Employee.class, new Integer(EmployeeID));
			session.delete(emp);
			tx.commit();
			
			System.out.print("Record deleted...");
			}
		
		catch(HibernateException e)
		{
			//if the commit is not taken then rollback
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		
		}
		finally{
			session.close();
		}
	}

}
