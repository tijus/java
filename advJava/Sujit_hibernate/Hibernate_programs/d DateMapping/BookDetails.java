import java.util.*;
public class BookDetails
{
	private int code;
	private String name;
	private Date publication;

	public BookDetails()
	{

	}
	public BookDetails(int code,String name,Date publication)
	{
		this.code=code;
		this.name=name;
		this.publication=publication;
	}
	public void setCode(int code)
	{
		this.code=code;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setPublication(Date publication)
	{
		this.publication=publication;
	}
	public int getCode()
	{
		return code;
	}
	public String getName()
	{
		return name;
	}
	public Date getPublication()
	{
		return publication;
	}
	public String toString()
	{
		return "Code: "+code+"\nName: "+name+"\nPublication Date: "+publication;
	}
}