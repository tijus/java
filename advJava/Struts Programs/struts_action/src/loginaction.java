import com.opensymphony.xwork2.ActionSupport;
public class loginaction extends ActionSupport 
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
	
	public void validate()
	{
		if(this.getUsername()==null||this.getUsername().equals(""))
		{
			this.addFieldError("username", getText("username.blank"));
		}
		if(this.getPassword()==null||this.getPassword().equals("")||this.getPassword().length()<3)
		{
			this.addFieldError("password", this.getText("password.blank"));
		}
	}
	public String execute()
	{
		if(this.getUsername().equals("sa")&&(this.getPassword().equals("hello")))
		{
			return success;
		}	
		else
		{
		  	addActionError(this.getText("action.error"));
			return error;
		}
			
	}
}

