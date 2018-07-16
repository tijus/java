import java.sql.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.*;
import java.io.IOException;

class J_14_clob_1
{
	public static void main(String args[])
	{
		try
		{
			PreparedStatement ps;
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/db1","scott","tiger");
			System.out.println("Successfully connected");
			String insert_pic="insert into myfile (id, name, filename) VALUES (?,?,?)";
			conn.setAutoCommit(false);
			File file=new File("Sandy.txt");
			FileReader fis=new FileReader(file);
			ps=conn.prepareStatement(insert_pic);
			ps.setInt(1,1);
			ps.setString(2,"John");
			ps.setCharacterStream(3,fis,(int)file.length());
			ps.executeUpdate();
			System.out.println("Successfully inserted record");
			conn.close();
			ps.close();
			fis.close();
		}
		catch(Exception e)
		{
			//printStackTrace(e);
			System.out.println(e);
		}
	}
}