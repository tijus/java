class StringOne
{
	public static void main(String args[])
	{
		String s1=new String("Sujit");
		String s2=new String("Singh");
		String s3=new String("SUJIT");
		String s4="Sujit";
		String s5="Singh";
		String s6="SUJIT";

		System.out.println("Compare using double equals");

		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1==s5);
		System.out.println(s1==s6);
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		System.out.println(s2==s5);
		System.out.println(s2==s6);
		System.out.println(s3==s4);
		System.out.println(s3==s5);
		System.out.println(s3==s6);
		System.out.println(s4==s5);
		System.out.println(s4==s6);
		System.out.println(s5==s6);
		System.out.println("Compare using equals");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equals(s6));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s2.equals(s5));
		System.out.println(s2.equals(s6));
		System.out.println(s3.equals(s4));
		System.out.println(s3.equals(s5));
		System.out.println(s3.equals(s6));
		System.out.println(s4.equals(s5));
		System.out.println(s4.equals(s6));
		System.out.println(s5.equals(s6));
		System.out.println("Compare using equals ignore case");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.equalsIgnoreCase(s5));
		System.out.println(s1.equalsIgnoreCase(s6));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s2.equalsIgnoreCase(s4));
		System.out.println(s2.equalsIgnoreCase(s5));
		System.out.println(s2.equalsIgnoreCase(s6));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s3.equalsIgnoreCase(s5));
		System.out.println(s3.equalsIgnoreCase(s6));
		System.out.println(s4.equalsIgnoreCase(s5));
		System.out.println(s4.equalsIgnoreCase(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		s1=s1.concat("singh");
		System.out.println(s1);
		System.out.println(s1.concat(s2));
		System.out.println(s4.concat(s5));
}


}