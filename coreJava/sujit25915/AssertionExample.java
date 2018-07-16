class AssertionExample
{
  public static void main(String args[])
  {
  	int value;
  	System.out.println("Enter your age");
  	value=Integer.parseInt(System.console().readLine());

  	assert value>=18:"Not a valid age";
  	System.out.println("Value is: "+value);
  }
}

//IN TEXTPAD run->(command->java),initialfolder->(-ea testfile)