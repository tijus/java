abstract class Animal
{
 abstract void Speak();
}

class AnonymousAnimal
{
	public static void main(String args[])
	{
		Animal d=new Animal()
		{
			void Speak()
			{
				System.out.println("It barks!!");
			}

		};
		d.Speak();
	}
}