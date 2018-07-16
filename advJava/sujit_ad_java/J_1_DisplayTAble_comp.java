import java.sql.*;
class J_1_DisplayTAble_comp
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/db1","scott","tiger");
			System.out.println("Successfully connected");

			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("Select * from company");

			while(rs.next())
			{
				//String code=rs.getString("co_code");
				//String name=rs.getString("c_name");

				String code=rs.getString(1);
				String name=rs.getString(2);

				System.out.println("Code: " +code+" Company: "+name);

			}

			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Could not execute the query String code=rs.getString(co_code);
				String name=rs.getString(c_name);"+e);
		}
	}
}