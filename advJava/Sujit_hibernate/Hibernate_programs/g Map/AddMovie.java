import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.HashMap;
import java.util.Map;
import com.mov.Movie;
public class AddMovie
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


			Movie m=new Movie();
			m.setId(1);
			m.setName("DDLJ");

			HashMap h=new HashMap();
			h.put("actor","Shahrukh");
			h.put("actress","Kajol");
			m.setDetails(h);

			session.save(m);


			Movie m1=new Movie();
			m1.setId(2);
			m1.setName("Lagaan");

			HashMap h1=new HashMap();
			h1.put("actor","Aamir");
			h1.put("actress","Gracy");
			m1.setDetails(h1);

			session.save(m1);
			System.out.println("\n\nRecords Added\n\n");



			Movie m2=new Movie();
			m2.setId(3);
			m2.setName("KKHH");

			HashMap h2=new HashMap();
			h2.put("actor","Shahrukh");
			h2.put("actress","Rani");
			m2.setDetails(h2);

			session.save(m2);
			System.out.println("Records Added");

			Movie m3=(Movie)session.load(Movie.class, 3);
			Map h3=m3.getDetails();
			System.out.println(h3.get("actor"));
			System.out.println(h3.get("actress"));
			tr.commit();
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

=================================================================
create table movie_details(
id int, name text);

create table details(
code int, name text, value text);

select * from movie_details
select * from details

delete from movie_details
delete from details

*/