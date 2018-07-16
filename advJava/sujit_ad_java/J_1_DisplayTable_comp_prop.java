import java.sql.*;
import java.io.*;
import java.util.*;

class J_1_DisplayTable_comp_prop
{
  public static void main(String args[])
  {
  	try
  	{
		Properties p=new Properties();
		p.load(new FileInputStream("jdbc.properties"));
		String driverstr=p.getProperty("driver");
		Class.forName(driverstr);
		String urlstr=p.getProperty("url");
		Connection conn=DriverManager.getConnection(urlstr,p);
		System.out.println("Successfully connected");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("Select * from company");
		while(rs.next())
		{
			String code=rs.getString("co_code");
			String name=rs.getString("c_name");

			System.out.println("Code: "+code+" Name: "+name);

		}
		conn.close();
	}
	catch(Exception e)
	{
		System.out.println("Error thrown "+e);
	}
  }
}