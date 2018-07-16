import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.emp.Employee;
import java.util.List;
import java.util.Iterator;
import org.hibernate.Query;

public class SelectClauseExample
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

			Query query=session.createQuery("select e.id , e.name , e.sal , e.joining from Employee e");
			for(Iterator it=query.iterate();it.hasNext(); )
			{
				System.out.println("\n\n");
				Object[] row = (Object[]) it.next();
				System.out.println("ID: " + row[0]);
				System.out.println("Name: " + row[1]);
				System.out.println("Salary: " + row[2]);
				System.out.println("Joining Date: " + row[3]);
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