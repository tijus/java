package com.film;
import java.util.*;
public class Film 
{
	private int id;
	private String name;
	private List songs;

	public Film()
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
	public void setSongs(List songs)
	{
		this.songs=songs;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public List getSongs()
	{
		return songs;
	}
}
