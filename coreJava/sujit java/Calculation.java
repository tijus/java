class Calculation
{
	public static void main(String args[])
	{
		System.out.println("Enter the value of a");
		int a=Integer.parseInt(System.console().readLine());
		System.out.println("Enter the value of b");
		int b=Integer.parseInt(System.console().readLine());
		int c[]=new int[5];
		try
		{
			c[5]=a/b;
			System.out.println("Result is: "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("You have an Arithmetic Exception ="+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You have an ArrayIndexOutOfBoundsException ="+e);
		}
		catch(Exception e)
		{
			System.out.println("You have an General Exception ="+e);
		}
	}
}