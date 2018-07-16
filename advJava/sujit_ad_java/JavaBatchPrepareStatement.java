import java.sql.*;
class JavaBatchPrepareStatement
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/db1","scott","tiger");
			System.out.println("Successfully connected");
			conn.setAutoCommit(false);
			String sqlStr="insert into company values(?,?)";

			PreparedStatement pst=conn.prepareStatement(sqlStr);
			pst.setString(1,"LNT");
			pst.setString(2,"Laurel nd Turbo");
			pst.addBatch();
			pst.setString(1,"Tata");
			pst.setString(2,"Tata");
			pst.addBatch();
			int []arr=pst.executeBatch();
			System.out.println("Inserted Successfully");
			//while(arr.length()>=0)
			//{
			//	System.out.println(arr);
			//}
			conn.commit();
			pst.close();
			conn.close();



		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}