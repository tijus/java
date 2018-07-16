package com.emp;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.emp.Employee;
import com.emp.SalesPerson;

public class AddEmployee_Inheritance_Mapping {
	
	public static void main(String[] args)
	{
		Session session = null;
		SessionFactory factory;
		try
		{
			factory=new Configuration().configure().buildSessionFactory();
			session=factory.openSession();
			Transaction tr=session.beginTransaction();

			Employee e1=new Employee(101,"Joe",25000);
			Employee e2=new SalesPerson(102,"Neel",21000,4000);
			session.save(e1);
			session.save(e2);

			System.out.println("\n Record Added Successfully! \n");

			tr.commit();
			System.out.println("\n Adding Records Completed ! \n");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.flush();
			session.close();
		}
	}

}
