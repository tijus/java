package com.emp;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.emp.Employee;
import java.util.*;

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

			Employee e1=new Employee(101,"Joe",25000, new Date());
			Employee e2=new Employee(102,"Neel",21000,new Date());
			Employee e3=new Employee(103,"Niki",15000,new Date());
			session.save(e1);
			session.save(e2);
			session.save(e3);

			tr.commit();
			System.out.println("\nRecords Added");

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
