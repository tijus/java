import java.sql.*;
class J_1_CreateTAble_comp
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/db1","SUJIT","ROOT");
			System.out.println("Successfully connected");
			Statement st=conn.createStatement();
			st.executeUpdate("Create table company"+"(co_code varchar2(5), c_name varchar2(20))");
			System.out.println("Table created");
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Could not execute the query"+e);
		}
	}
}