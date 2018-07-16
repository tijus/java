package com.emp;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;
import com.emp.Employee;

public class FromClauseExample {
	public static void main(String[] args){
		Session session = null;
		SessionFactory factory;
		try{
			factory=new Configuration().configure().buildSessionFactory();
			session=factory.openSession();
			Transaction tr=session.beginTransaction();

			Query query=session.createQuery("from Employee e");
			List list=query.list();
			Iterator iter=list.iterator();
				while(iter.hasNext()){
					System.out.println("\n\n");
					Employee e=(Employee)iter.next();
					System.out.println(e.getId());
					System.out.println(e.getSal());
					System.out.println(e.getName().trim());
					System.out.println(e.getJoining());
				}
			tr.commit();
		}
		catch(Exception e){	e.printStackTrace();}
		finally{
			session.flush();
			session.close();
		}
	}
}
