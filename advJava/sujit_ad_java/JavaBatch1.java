import java.sql.*;
class JavaBatch1
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
			String sqlStr="insert into company values('TCS','Tata Consult.')";
			st.addBatch(sqlStr);
			sqlStr="insert into company values('TC','Techcheck Inc.')";
			st.addBatch(sqlStr);
			int []arr=st.executeBatch();
			System.out.println(arr);
			//while(arr.length()>=0)
			//{
			//	System.out.println(arr);
			//}
			conn.commit();
			st.close();
			conn.close();



		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}