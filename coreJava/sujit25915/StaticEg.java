class StaticEg
{
 //static int x=30;
 static class Inner
 {
	 void msg1(int x)
	 {
		 System.out.println("value of x:"+x);
	 }
	 static int msg2(int x)
	 {
	 	 //System.out.println("value of x:"+ ++x);
	 	 return x;
	 }
 }
 public static void main(String args[])
 {
	StaticEg.Inner a1=new StaticEg.Inner();
	a1.msg1(2);
	System.out.println(StaticEg.Inner.msg2(2));
	System.out.println(StaticEg.Inner.msg2(3));
 }
}