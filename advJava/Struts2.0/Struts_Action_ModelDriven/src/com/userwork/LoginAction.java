package com.userwork;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.org.apache.regexp.internal.RE;
@SuppressWarnings("serial")
public class LoginAction  extends ActionSupport implements ModelDriven<User> ,ServletRequestAware
{
	private User user;
	private HttpServletRequest request;
	
	@Override
	public void setServletRequest(HttpServletRequest request) 
	{
		this.request=request;
		
	}
	
	@Override
	public User getModel() 
	{
		user = new User();
		return user;
	}
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
			addFieldError("username",this.getText("username.blank"));
		}
		if(this.getUser().getPassword().equals(""))
		{
			addFieldError("password",this.getText("password.blank"));
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
