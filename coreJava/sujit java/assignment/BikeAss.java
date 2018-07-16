class Bike
{
	String name,color;
	int model,speed,brake,gear;

	void insert(String name, String color, int model)
	{
		this.name=name;
		this.color=color;
		this.model=model;
	}
	void display()
	{
		System.out.println("Name = "+name+" Color = "+color+"Model = "+model);

	}
	void acceleration(int speed)
	{
		this.speed=speed;
		System.out.println("Speed = "+speed);
	}
	void brake(int brake)
	{
		this.brake=brake;
		System.out.println("Brake = "+brake);
	}
	void transmission(int gear)
		{
			this.gear=gear;
			System.out.println("gear = "+gear);
	}

}

class BikeAss
{
	public static void main(String args[])
	{
		Bike b1=new Bike();
		b1.insert("Yamaha", "Black", 4512);
		b1.display();
		b1.acceleration(100);
		b1.brake(25);
		b1.transmission(02);
	}
}