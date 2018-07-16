import java.sql.*;
import java.io.*;

class J_14_clob_2
{
	public static void main(String args[])
	{
		try
		{

			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/db1","scott","tiger");
			System.out.println("Successfully connected");
			Statement st=conn.createStatement();
			String select_file="Select name, filename from myfile";
			ResultSet rs=st.executeQuery(select_file);
			rs.next();
			Clob c=rs.getClob(2);
			Reader bis=c.getCharacterStream();
			FileWriter fo=new FileWriter("newSandy.txt");
			int b=0;
			while((b=bis.read())>=0)
			{
				fo.write(b);
			}
			fo.close();
			bis.close();

			System.out.println("Successfully inserted record");
			conn.close();

		}
		catch(Exception e)
		{
			//printStackTrace(e);
			System.out.println(e);
		}
	}
}