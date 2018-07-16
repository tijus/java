import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.emp.Employee;
import com.emp.SalesPerson;
public class AddEmployee_Inheritance_Mapping
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

			Employee e1=new Employee(101,"Joe",25000);
			Employee e2=new SalesPerson(102,"Neel",21000,4000);
			session.save(e1);
			session.save(e2);

			System.out.println("\n Record  Added Successfully ! \n");

			tr.commit();
			System.out.println("\n Adding Records Completed ! \n");

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

================================================================================
DataBase creation
========================================

emp_per_class.hbm.xml

***Emp per class

create table emp_class(
empid int, emp_type varchar(20),empname varchar(20), empsal int, incentives int)

select * from emp_class
=============================================================

emp_per_subclass.hbm.xml

***emp(table) per subclass

create table emp_subclass(
empid int,empname varchar(20), empsal int)
create table salesperson_subclass(
empid int, incentives int)

select * from emp_subclass
select * from salesperson_subclass
==============================================================

emp_per_concreteclass.hbm.xml

***table per concrete class

create table emp_concreteclass(
empid int,empname varchar(20), empsal int)
create table salesperson_concreteclass(
empid int,empname varchar(20), empsal int,eincentives int)

select * from emp_concreteclass
select * from salesperson_concreteclass

===============================================================
drop table emp_class

drop table salesperson_subclass
drop table emp_subclass

drop table emp_concreteclass
drop table salesperson_concreteclass

*/