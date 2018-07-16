class OutEg
{
	int x=50;
	class InnerEg
	{
		void message()
		{
			System.out.println("value of x:"+x);
		}
	}
	void display()
	{
		InnerEg ie=new InnerEg();
		ie.message();
	}
	public static void main(String args[])
	{
		OutEg oe=new OutEg();
		oe.display();
	}
}