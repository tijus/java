class Student
{
	String Name;
	int rollno;
	Student(String Name,int rollno)
	{
		this.Name=Name;
		this.rollno=rollno;
	}
	public String toString()
	{
		return "Name: "+Name+"\nRoll No: "+rollno;
	}
}


class RunningStudent
{

	public static void main(String args[])
	{
		Student s1=new Student("Sujit",101);
		System.out.println(s1);
	}
}