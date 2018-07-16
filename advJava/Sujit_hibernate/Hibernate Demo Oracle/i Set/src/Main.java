import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.*;

public class Main {
	public static void main(String[] args) {

		Session session = null;
		SessionFactory factory;
		try
		{
		factory=new Configuration().configure().buildSessionFactory();
		session=factory.openSession();
		Transaction tr=session.beginTransaction();

		Set<Course> courses = new HashSet<Course>();
		courses.add(new Course("Maths"));
		courses.add(new Course("Computer Science"));

		Student student1 = new Student("Eswar", courses);
		Student student2 = new Student("Joe", courses);
		session.save(student1);
		session.save(student2);

		tr.commit();
	} catch (HibernateException e) {
		//tr.rollback();
		e.printStackTrace();
	} finally {
		session.close();
	}
}
}
