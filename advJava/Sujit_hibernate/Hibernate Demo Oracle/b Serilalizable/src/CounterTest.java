import org.hibernate.*;
import org.hibernate.cfg.*;

public class CounterTest {
	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();


		Counter c1=new Counter();
		c1.setCode("First");
		c1.setValue(new Integer(100));
		c1.setContact(new Contact("Sachin",100000));
		session.save(c1);

		Counter c2=(Counter)session.load(Counter.class, c1.getCode());
		System.out.println(c1.getCode() + " :" +c1.getValue().intValue()+ " :" +c1.getContact());
		System.out.println(c2.getCode() + " :" +c2.getValue().intValue()+ " :" +c1.getContact());
		tx.commit();
		session.close();
	}
}
