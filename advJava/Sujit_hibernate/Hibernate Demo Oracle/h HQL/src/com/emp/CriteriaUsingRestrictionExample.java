package com.emp;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.emp.Employee;
import java.util.List;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class CriteriaUsingRestrictionExample {
	public static void main(String[] args)
	{
		Session session = null;
		SessionFactory factory;
		int count=0;
		try
		{
			factory=new Configuration().configure().buildSessionFactory();
			session=factory.openSession();
			Transaction tr=session.beginTransaction();

			Criteria cr=session.createCriteria(Employee.class);

			cr.add(Restrictions.between("sal", new Integer(23000),new Integer(45000)));
			List list=cr.list();

			Iterator iter=list.iterator();
			while(iter.hasNext()){
				System.out.println("\n\n");
				System.out.println("Retrieved is "+iter.next());
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
