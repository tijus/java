import java.sql.*;

class ResultSet_sensitive_updatable_J2
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/db1","scott","tiger");
			System.out.println("Successfully connected");
			Statement s=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=s.executeQuery("select co_code,c_name from company where co_code='BOI'");
			ResultSet rs1=s.executeQuery("select co_code,c_name from company");
			//while(rs.next())
			//{
			//	rs.updateString(2,"ModifiedCompanyName2");
			//	rs.updateRow();
			//}
			//rs.last();
			//rs.moveToInsertRow();
			//rs.updateString("co_code","Imp1");
			//rs.updateString("c_name","Impetus Cons1");
			//rs.insertRow();
			//rs.last();
			while(rs.next())
			{
			System.out.println(rs.getString("co_code"));
			rs.deleteRow();
			}
			while(rs1.next())
			{
			System.out.println(rs1.getString("co_code"));
			}
			//rs.deleteRow();
			//System.out.println(rs.rowDeleted());
			conn.commit();
			rs1.close();
			rs.close();
			s.close();
			conn.close();
		}

		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}