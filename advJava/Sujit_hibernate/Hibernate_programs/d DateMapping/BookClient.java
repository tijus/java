import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.Date;

public class BookClient
{
	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();

		BookDetails book1=new BookDetails(107,"Java Servlets",new Date());
		session.save(book1);

		//BookDetails c2=(BookDetails)session.load(BookDetails.class, book1.getCode());
		BookDetails c2=(BookDetails)session.load(BookDetails.class, 107);

		System.out.println("\n\n");

		System.out.println(book1.getCode() + " :" +book1.getPublication());
		System.out.println(c2.getCode() + " :" +c2.getPublication());
		System.out.println("\n\n");
		System.out.println(c2);

		tx.commit();
		session.close();
	}
}



/*



set java_home=C:\Java\jdk1.6.0

set classpath=%classpath%;hibernate3.jar;.;

set path=C:\Java\jdk1.6.0\bin

javac -d . *.java

java Book_Client




drop table Book_Data

create table Book_Data(
code int, name varchar(20), publ_date datetime)

select * from Book_Data
*/