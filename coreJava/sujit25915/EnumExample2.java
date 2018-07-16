enum Season{Winter, summer, spring, fall}

class EnumExample2
{
	public static void main(String args[])
	{
		Season s=Season.Winter;
		System.out.println(s);
		for (Season s2:Season.values())
		System.out.println(s2);
	}
}