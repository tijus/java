package com.emp;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.emp.Employee;
import java.util.List;
import java.util.Iterator;
import org.hibernate.Query;

public class OrderByExample {
	public static void main(String[] args){
		Session session = null;
		SessionFactory factory;
		int count=0;
		try{
			factory=new Configuration().configure().buildSessionFactory();
			session=factory.openSession();
			Transaction tr=session.beginTransaction();
			Query query=session.createQuery("from Employee e order by e.sal");
			//Query query=session.createQuery("from Employee e order by e.sal desc");
			List list=query.list();
			Iterator iter=list.iterator();
			while(iter.hasNext()){
				System.out.println("\n\n");
				System.out.println(iter.next());
			}
			tr.commit();
		}
		catch(Exception e){	e.printStackTrace();}
		finally
		{
			session.flush();
			session.close();
		}
	}
}
