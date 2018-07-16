import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import com.emp.Employee;

public class UpdateEmployee
{
	public static void main(String[] args)
	{
		Session session = null;
		SessionFactory factory=null;
		try
		{
			factory=new Configuration().configure().buildSessionFactory();
			session=factory.openSession();
			Transaction tr=session.beginTransaction();

			int id=Integer.parseInt(args[0]);
			int sl=Integer.parseInt(args[2]);

			Object o =session.load(Employee.class,new Integer(id));
			Employee emp=(Employee)o;
			emp.setName(args[1]);
			emp.setSal(sl);
			session.update(emp);
			tr.commit();
			System.out.println("\n\n******Record Updated**** \n\n");
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