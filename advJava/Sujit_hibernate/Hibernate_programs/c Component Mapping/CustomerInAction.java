import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.cust.Address;
import com.cust.Customer;
public class CustomerInAction
{
	public static void main(String[] args)
	{
		Session session = null;
		SessionFactory factory;
		try
		{
			factory=new Configuration().configure().buildSessionFactory();
			session=factory.openSession();
			Transaction tr=session.beginTransaction();

			Customer c1=new Customer();
			c1.setCid("C002");
			c1.setCname("Charudatta Joshi");

			Address a1=new Address();
			a1.setCity("Mumbai");
			a1.setState("Maharashtra");

			c1.setCaddress(a1);
			session.save(c1);
			tr.commit();


			System.out.println("\n\n*****Records Added*****\n\n");
			Customer c2=(Customer)session.load(Customer.class,"C002");
			System.out.println(c2.getCid());
			System.out.println(c2.getCname());
			Address ad=c1.getCaddress();
			System.out.println(ad.getCity());
			System.out.println(ad.getState());

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

/*
set java_home=C:\Java\jdk1.6.0

set classpath=%classpath%;hibernate3.jar;.;

set path=C:\Java\jdk1.6.0\bin

javac -d . *.java

java CustomerInAction

create table customer_details(
cust_id text,
cust_name text,
city text,
state text,
 );

select * from customer_details
*/