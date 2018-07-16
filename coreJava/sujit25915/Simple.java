class Simple
{
	private static int x=70;
	void display()
	{
		final int y=100;
		class Local
		{
			void message()
			{
				System.out.println("x value: "+x+"\n y value:"+y);
			}
		}
		Local l=new Local();
		l.message();
	}
	public static void main(String args[])
	{
		Simple obj=new Simple();
		obj.display();
		System.out.println(Simple.x);
	}
}