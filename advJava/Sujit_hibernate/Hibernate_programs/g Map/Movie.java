package com.mov;
import java.util.Map;
public class Movie 
{
	private int id;
	private String name;
	private Map details;

	public Movie()
	{
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setDetails(Map details)
	{
		this.details=details;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public Map getDetails()
	{
		return details;
	}
}
