import java.sql.*;
public class ExceptionClass{
	public static Connection connection=null;
	public static void main(String args[]) throws Exception
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/db1","scott","tiger");

			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from guests");
			System.out.println(rs.getString(1));
			stmt.close();
		}
		catch(SQLException e){
			System.out.println("SQLException Exception: ");
			System.out.println("message: "+e.getMessage());
			System.out.println("SQLState: "+e.getSQLState());
			System.out.println("Vendor Code: "+e.getErrorCode());
			System.out.println("----------------------------------------");
			e.printStackTrace();
		}
		catch(Exception ex){
					System.out.println("An exception other than SQL exception was thrown\n");
					ex.printStackTrace();

		}

		if(connection!=null)
			connection.close();

	}
}