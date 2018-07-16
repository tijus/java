import java.sql.*;
import java.io.*;

class J_14_blob_2
{
	public static void main(String args[])
	{
		try
		{
			PreparedStatement ps;
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/db1","scott","tiger");
			System.out.println("Successfully connected");
			Statement st=conn.createStatement();
			String select_pic="Select name, photo from mypictures";
			ResultSet rs=st.executeQuery(select_pic);
			rs.next();
			InputStream bis=rs.getBinaryStream("photo");
			FileOutputStream fo=new FileOutputStream("newSunset.jpg");
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