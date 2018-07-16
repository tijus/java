import java.sql.*;
class J_1_UpdateTAble_comp
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
			st.executeUpdate("Update company set c_name='BOI Ltd.' where co_code='BOI'");
			System.out.println("Record updated successfully");
			st.executeUpdate("Delete from company where co_code='TCS'");
			System.out.println("Record deleted successfully");
			conn.commit();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Could not execute the query"+e);
		}
	}
}