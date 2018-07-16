import java.sql.*;
import javax.swing.*;
import java.awt.*;
class Prepared_Swing2Insert
{
	public static void main(String args[])
	{
		try
		{

			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/db1","scott","tiger");
			System.out.println("Successfully connected");
			conn.setAutoCommit(false);
			String str="Insert into company values(?,?)";
			PreparedStatement st=conn.prepareStatement(str);
			String str2=JOptionPane.showInputDialog("Please enter company code");
			st.setString(1,str2);
			String str3=JOptionPane.showInputDialog("Please enter company name");
			st.setString(2,str3);

			ResultSet rs=st.executeQuery();
			conn.commit();

			System.out.println("Values inserted");
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Could not execute the query"+e);
		}
	}
}