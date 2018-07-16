package com.emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * 
 *  {@docRoot}/DeletEmployee.java
 *  
 * -Deleting employee details
 *
 */
public class DeletEmployee {
	public static void main(String args[])
	{
		
		Session session=null;
		SessionFactory factory;
		
		try{
			factory=new Configuration().configure().buildSessionFactory();
			session=factory.openSession();
			Transaction tr=session.beginTransaction();
			
			//int id=Integer.parseInt(args[0]);
			Employee emp=(Employee)session.get(Employee.class, new Integer(14));
			
			session.delete(emp);
			
			tr.commit();
			
			System.out.print("Record deleted");
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
