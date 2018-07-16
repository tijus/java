import java.sql.*;

class ResultSet_sensitive_updatable_J3
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/db1","scott","tiger");
			System.out.println("Successfully connected");
			Statement s=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=s.executeQuery("select * from emp");
			ResultSetMetaData rsme=rs.getMetaData();

			System.out.println("Column Name: "+rsme.getColumnName(2));
			System.out.println("Column Label: "+rsme.getColumnLabel(2));
			System.out.println("Column Count: "+rsme.getColumnCount());
			System.out.println("Column Type: "+rsme.getColumnType(2));
			System.out.println("Column Type Name: "+rsme.getColumnTypeName(2));
			System.out.println("Column Class Name 1: "+rsme.getColumnClassName(1));
			System.out.println("Column Class Name 2: "+rsme.getColumnClassName(2));
			rs.close();
			s.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}