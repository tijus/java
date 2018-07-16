package com.emp;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.emp.Employee;

public class AddEmployee {
	
	public static void main(String[] args)
	{
		Session session = null;
		SessionFactory factory;
		try
		{
			factory=new Configuration().configure().buildSessionFactory();
			session=factory.openSession();
			Transaction tr=session.beginTransaction();
			int id=Integer.parseInt(args[0]);
			int sl=Integer.parseInt(args[2]);			 
			
			Employee emp1=new Employee(id,args[1],sl);
			//Employee emp1=new Employee(11,"Sachin", 1000);			
			session.save(emp1);
			/*emp1=new Employee(12,"Saurav", 2000);
			session.save(emp1);
			emp1=new Employee(13,"Rahul", 3000);
			session.save(emp1);
			emp1=new Employee(14,"Anil", 4000);
			session.save(emp1);*/
			session.flush();
			tr.commit();
			System.out.println("\n**Record Added**\n");
			session.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
		}
	}
	

}
