import java.sql.*;

class J_DatabaseMetaData
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/db1","scott","tiger");
			System.out.println("Successfully connected");

			DatabaseMetaData dbmd=conn.getMetaData();

			System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
			System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());
			System.out.println("Driver Name: "+dbmd.getDriverName());
			System.out.println("Driver Version: "+dbmd.getDriverVersion());
			System.out.println("Maximum Connection: "+dbmd.getMaxConnections());


			//conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}