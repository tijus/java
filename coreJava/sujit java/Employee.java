class EmployeeWithConstructor{

	String name;
	int id;
	float sal;
	float tax;
	EmployeeWithConstructor(String n,int i,float s)
	{
		name=n;
		id=i;
		sal=s;
	}
	EmployeeWithConstructor(String n,float s)
	{
			name=n;
			sal=s;
	}
	EmployeeWithConstructor(String n,int i)
	{
			name=n;
			id=i;
	}
	EmployeeWithConstructor()
	{
			name="Null";
			id=0;
			sal=0;
	}
	float setTax()
	{
		tax=(12*sal)/100;
		return tax;

	}
	void getRecord()
	{
		System.out.println("Your name is "+name);
		System.out.println("Your id is "+id);
		System.out.println("Your tax is"+tax);
	}


}

class Employee{
	public static void main(String args[])
	{
		EmployeeWithConstructor e1=new EmployeeWithConstructor("Rahul",101,25000);
		e1.setTax();
		e1.getRecord();
		EmployeeWithConstructor e2=new EmployeeWithConstructor("Sanjay",5000);
		e2.setTax();
		e2.getRecord();
		EmployeeWithConstructor e3=new EmployeeWithConstructor("Raj",102);
		e3.setTax();
		e3.getRecord();
		EmployeeWithConstructor e4=new EmployeeWithConstructor();
		e4.setTax();
		e4.getRecord();

	}

}