import org.hibernate.*;
import org.hibernate.cfg.*;
import com.film.Film;
import com.film.Song;
import java.util.*;
public class AddFilm
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

			Film m1=new Film();
			m1.setId(1);
			m1.setName("Dil Chahta Hai");

			ArrayList list=new ArrayList();
			list.add(new Song(101,"Koi Kahe"));
			list.add(new Song(102,"Jaane Kyu"));
			list.add(new Song(103,"Tanhaai"));

			m1.setSongs(list);
			session.save(m1);

			Film m2=new Film();
			m2.setId(2);
			m2.setName("aaaaaaa");

			ArrayList list2=new ArrayList();
			list2.add(new Song(201,"aaa"));
			list2.add(new Song(202,"bbbb"));
			list2.add(new Song(203,"cccc"));

			m2.setSongs(list2);
			session.save(m2);

			//tr.commit();
			System.out.println("Record Added");

			Film m3=new Film();
			m3.setId(3);
			m3.setName("bbbbbbbbbbb");

			ArrayList list3=new ArrayList();
			list3.add(new Song(301,"aaa33"));
			list3.add(new Song(302,"bbbb33"));
			list3.add(new Song(303,"cccc33"));

			m3.setSongs(list3);
			session.save(m3);

			tr.commit();
			System.out.println("Record Added again");

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

========================================================

create table film_details(
id int, name text);

create table songs(
id int, name text, idx int, parent_id int);

select * from film_details
select * from songs

delete from film_details
delete from songs
*/