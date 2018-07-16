import java.sql.*;
public class Procedure_ex_1{
	public static void main(String args[]) throws Exception
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/db1","scott","tiger");
		CallableStatement stmt=conn.prepareCall("{call INSERTR(?,?)}");
		stmt.setInt(1,1015);
		stmt.setString(2,"Amit");
		stmt.execute();
		System.out.println("Success");
	}
}