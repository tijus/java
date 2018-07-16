interface Showable
{
	void show();

	interface Message
	{
		void msg();
	}
}

class Test1 implements Showable.Message
{
	public void msg()
	{
		System.out.println("Hello nested interface");
	}
	public static void main(String args[])
	{
		Showable.Message a1=new Test();//upcasting
		//Test1 a1=new Test1();
		a1.msg();
	}
}