
class Bike{
	String color;
	String Bikename;
	int bikeno;
	int acc;
	int bbreak;
	Bike(String color, String Bikename, int bikeno)
	{
		this.color=color;
		this.Bikename=Bikename;
		this.bikeno=bikeno;
	}
	void accel(int acc)
	{
		this.acc=acc;
	}
	void bbreak(int bbreak)
	{
		this.bbreak=bbreak;
	}
	void getRecord()
	{
		System.out.println("Color = "+color+"\nBikename = "+Bikename+"\nBike Number = "+bikeno+"\nAcceleration = "+acc+"\nBreak = "+bbreak);
	}

}
class Honda extends Bike{

	 int modelno;
	 String result;
	 Honda(String color, String Bikename, int bikeno, int modelno)
	 {
	 	super(color, Bikename, bikeno);
	 	this.modelno=modelno;
 	 }
	 void accel(int acc, int limit)
	 {
		 super.accel(acc);
		 if(limit<=acc)
		 {
			result="Appropriate model";
		 }
		 else
		 {
			 result="Out of range";
		 }
	 }
	 void getRecord()
	 {
		 super.getRecord();
		 System.out.println("The specified model of Honda bike is "+modelno);
		 System.out.println(result);
	 }
}
class Yamaha extends Bike{
	String designtype;
	int i;
	double d;
	String result;

	Yamaha(String color, String Bikename, int bikeno, String designtype)
	{
		super(color, Bikename, bikeno);
		this.designtype=designtype;
		//super(color, Bikename, bikeno);
 	 }
	void bbreak(int bbreak, int jerk)
	{
		super.bbreak(bbreak);
		if(jerk<=25)
		{
			result="Torque giving nice outcome";
		}
		else
		{
			result="Torque needs improvement";
		}

	}
	void getRecord()
	{
		super.getRecord();
		System.out.println("The specified bike of Yamaha has a designtype is "+designtype);
		System.out.println("The payment paid is  "+i+"in cash and "+d+"in cheque" );
		System.out.println(result);
	}
	void payment(int i)
	{
		this.i=i;
	}
	void payment(int i, double d)
		{
			this.i=i;
			this.d=d;
	}

}
class InheritenceConcept{

public static void main (String args[])
{
	Honda b1=new Honda("Black","Honda",4578,25456);
	b1.accel(100,200);
	b1.getRecord();
	System.out.println("---------------");
	Yamaha b2=new Yamaha("Black","Yamaha",4578,"Sports");
	b2.bbreak(25,32);
	b2.payment(25000);
	b2.getRecord();
	System.out.println("---------------");
	Yamaha b3=new Yamaha("Black","Yamaha y212",4578,"Sports");
	b3.bbreak(25,23);
	b3.payment(12500,12500);
	b3.getRecord();

}
}