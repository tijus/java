import org.hibernate.*;
import org.hibernate.cfg.*;

public class CounterTest
{
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


/*
set java_home=C:\Java\jdk1.6.0

set classpath=%classpath%;hibernate3.jar;.;

set path=C:\Java\jdk1.6.0\bin

javac -d . *.java

create table counter
(id text not null,
ivalue image);

select * from counter

drop table counter

===================================================================================
NOT NECESSARY TO DO THIS

D:\Simple Mapping>set path=%java_home%\bin

D:\Simple Mapping>set java_home=C:\Java\jdk1.6.0

D:\Simple Mapping>set classpath=%classpath%;D:\hibernate-2.1\hibernate2.jar;.;

====================================================================================

*/
