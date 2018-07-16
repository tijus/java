import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.emp.Employee;

public class AddEmployee
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
			int id=Integer.parseInt(args[0]);
			int sl=Integer.parseInt(args[2]);

			Employee emp1=new Employee(id,args[1],sl);
			session.save(emp1);
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

/*
D:\Simple Mapping>set java_home=C:\Java\jdk1.6.0

D:\Simple Mapping>set classpath=%classpath%;hibernate3.jar;.;

D:\Simple Mapping>set path=C:\Java\jdk1.6.0\bin

D:\Simple Mapping>java AddEmployee 2 Sachin  55000
*/