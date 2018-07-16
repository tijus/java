import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class ReflectionExample
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Enter the name of the class");
			String nameofclass=System.console().readLine();
			Class c1=Class.forName("java.lang."+nameofclass);
			Constructor cnst[]=c1.getConstructors();
			Field fld[]=c1.getDeclaredFields();
			Method mtd[]=c1.getMethods();
			System.out.println("\nName of the Constructors of the"+nameofclass);
			for(int i=0;i<cnst.length;i++)
			{
				System.out.println(cnst[i].getName());
			}
			System.out.println("\nName of the Declared Fields of the"+nameofclass);
			for(int i=0;i<fld.length;i++)
			{
				System.out.println(fld[i].getName());
			}
			System.out.println("\nName of the Methods  of the"+nameofclass);
			for(int i=0;i<mtd.length;i++)
			{
				System.out.println(mtd[i].getName());
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
	}
}