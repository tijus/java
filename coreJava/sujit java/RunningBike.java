interface NewInter
{
	void move();
}
interface New
{

}
interface Ideal
{
	void stop();
}
interface Movable extends Ideal, New
{
	void move();
}
abstract class Bike implements Movable
{
	String color;
	Bike(String color)
	{
		this.color=color;
	}
	abstract void accel();
	void display()
	{
		System.out.println("Color = "+color);
	}
	public void stop()
	{

	}
}
class Honda extends Bike implements NewInter
{
	int bikenumber;
	Honda(String color,int bikenumber)
	{
		super(color);
		this.bikenumber=bikenumber;
	}
	void display()
	{
		super.display();
		System.out.println("Bike Number = "+bikenumber);
	}
	void accel()
	{
		System.out.println("Honda .... acceleration limit is 100kmph");
	}
	public void move()
	{
		System.out.println("Honda .... Moving");
	}
}
class Yamaha extends Bike
{
	int modelnumber;
	Yamaha(String color,int modelnumber)
	{
		super(color);
		this.modelnumber=modelnumber;
	}
	void display()
	{
		super.display();
		System.out.println("Model Number = "+modelnumber);
	}
	void accel()
	{
		System.out.println("Yamaha .... acceleration limit is 150kmph");
	}
	public void move()
	{
		System.out.println("Yamaha .... Moving");
	}
}
class RunningBike
{
	public static void main(String args[])
	{
		Honda h1=new Honda("Black", 7458);
		h1.display();
		h1.accel();
		h1.move();
		Yamaha y1=new Yamaha("Blue", 4578);
		y1.display();
		y1.accel();
		y1.move();
	}
}