package com.cust;
public class Customer
{
	String cid,cname;
	Address caddress;

	public Customer()
	{
	}
	public void setCid(String cid)
	{
		this.cid=cid;
	}
	public void setCname(String cname)
	{
		this.cname=cname;
	}
	public void setCaddress(Address caddress)
	{
		this.caddress=caddress;
	}
	public String getCid()
	{
		return cid;
	}
	public String getCname()
	{
		return cname;
	}
	public Address getCaddress()
	{
		return caddress;
	}
}
