package com.strutswork;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action
{
	public String execute()
	{
		System.out.println(SUCCESS);
		return SUCCESS; 
		
		
	}
}
