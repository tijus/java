class BookNotFoundException extends Exception
{}

class Project
{
	int book;
	Project(int book)
	{
		this.book=book;
	}

	void readBook() throws BookNotFoundException
	{
		if (book>0)
		{
		System.out.println("BookRead();	");
		System.out.println("BookExplained();	");
		}
		else
		{
			throw new BookNotFoundException();
		}

	}
	public static void main(String args[])
	{
		Project p1=new Project(0);
		try
		{
		p1.readBook();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}
}