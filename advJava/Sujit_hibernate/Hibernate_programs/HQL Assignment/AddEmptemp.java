import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class AddEmptemp
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
			Emptemp emp1=new Emptemp(11,"Scott",5000,"CLERK",10,25);
			Emptemp emp2=new Emptemp(12,"Jones",6000,"SALESMAN",20,28);
			Emptemp emp3=new Emptemp(13,"Robert",6500,"CLERK",20,30);
			Emptemp emp4=new Emptemp(14,"King",9000,"PRESIDENT",30,35);
			Emptemp emp5=new Emptemp(15,"Bill",8000,"CEO",10,30);
			session.save(emp1);
			session.save(emp2);
			session.save(emp3);
			session.save(emp4);
			session.save(emp5);
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