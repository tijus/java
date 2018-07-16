package com.userwork;

public class User
{
	private String username,password;

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public boolean doCheck()
	{
		if(this.getUsername().equals("sa")&&(this.getPassword().equals("hello")))
		{
			return true;
		}	
		else
		{
			
			return false;
		}
	}
	
}
