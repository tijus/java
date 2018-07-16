import java.sql.*;
class J_1_InsertTAble_comp
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/db1","scott","tiger");
			System.out.println("Successfully connected");
			conn.setAutoCommit(false);
			Statement st=conn.createStatement();
			st.executeUpdate("Insert into company values ('BOI','Bank of India')");
			System.out.println("Record inerted successfully");
			st.executeUpdate("Insert into company values ('TC','Techcheck Inc.')");
			System.out.println("Record inerted successfully");
			st.executeUpdate("Insert into company values ('TCS','Tata Consultancy')");
			System.out.println("Record inerted successfully");
			st.executeUpdate("Insert into company values ('LNT','Laurel N Turbo')");
			System.out.println("Record inerted successfully");

			conn.commit();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Could not execute the query"+e);
		}
	}
}