import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import com.emp.Employee;
import java.util.List;
import java.util.Iterator;

public class WhereClauseExample{
	public static void main(String[] args){
		Session session = null;
		SessionFactory factory;
		int count=0;
		try{
				factory=new Configuration().configure().buildSessionFactory();
				session=factory.openSession();
				Transaction tr=session.beginTransaction();

				Query query=session.createQuery("from Employee e where e.sal>=20000");
				List list=query.list();
				Iterator iter=list.iterator();
				while(iter.hasNext()){
					System.out.println("\n\n\n");
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