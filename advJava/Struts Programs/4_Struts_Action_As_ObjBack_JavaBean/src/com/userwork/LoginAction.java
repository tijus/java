package com.userwork;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.org.apache.regexp.internal.RE;
@SuppressWarnings("serial")
public class LoginAction  extends ActionSupport
{
	private User user;
	
	
	public User getUser() 
	{
		return user;
	}
	public void setUser(User user) 
	{
		this.user = user;
	}
	public void validate()
	{
		if(this.getUser().getUsername().equals(""))
		{
			addFieldError("user.username",this.getText("username.blank"));
		}
		if(this.getUser().getPassword().equals(""))
		{
			addFieldError("user.password",this.getText("password.blank"));
		}
	}
	public String execute()
	{
		if(user.doCheck())
		{
			return SUCCESS;
		}	
		else
		{
			addActionError(this.getText("action.error"));
			return ERROR;
		}
			
	}
}
