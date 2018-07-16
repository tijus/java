//import p1.*;  ....cannot access RunningABC bad class file: .\RunningABC.java
import p1.RunningABC;

class RunningA
{
public static void main(String args[])
{
 RunningABC r1=new RunningABC();
 System.out.println("Enter the value to be displayed");
 int a=Integer.parseInt(System.console().readLine());
 r1.setvariable(a);
 System.out.println(r1.getvariable());
}
}