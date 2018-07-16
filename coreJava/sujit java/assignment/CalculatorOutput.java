class Calculator
{
	static int a,b,result;
	static void addition()
	{
		System.out.println("addition no parameters no return");
		result=a+b;
	}
	static void subtraction(int a, int b )
	{
		System.out.println("subtraction parameters no return");
		result=a-b;
	}
	static int multiplication()
	{

		System.out.println("multiplication no parameters return");
		return a*b;
	}
	static int division(int a, int b)
	{
		System.out.println("division parameters return");
		return a/b;

	}
}

class CalculatorOutput
{
	public static void main(String args[])
	{
		Calculator.addition();
		Calculator.subtraction(5,2);
		Calculator.multiplication();
		System.out.println(Calculator.division(5,2));
	}
}