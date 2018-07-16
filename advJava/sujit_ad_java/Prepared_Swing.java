import java.sql.*;
import javax.swing.*;
class Prepared_Swing
{

	public static int itr=0;
	public void callable()
	{
		try
		{


			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/db1","scott","tiger");
			System.out.println("Successfully connected");
			//String que="Select * from company";
			String str="Select * from company where co_code=?";
			//PreparedStatement que_st=conn.prepareStatement(que);
			PreparedStatement st=conn.prepareStatement(str);
			String str2=JOptionPane.showInputDialog("Please enter company code");

			st.setString(1,str2);
			//que.setString(1,str2);
			//ResultSet rs1=que.executeQuery();
			ResultSet rs=st.executeQuery();


			if(rs.next())
			{

				String code=rs.getString(1);
				String name=rs.getString(2);

				System.out.println("Code: "+code+ " Name: "+name);


			}


			else
			{

					System.out.println("Invalid Process");
					while(itr<=3)
					{
						Prepared_Swing obj=new Prepared_Swing();
						obj.callable();
						itr=itr+1;
					}

			}

				conn.close();
			}





		catch(Exception e)
		{
			System.out.println("Could not execute the query"+e);
		}}
	public static void main(String args[])
	{
			Prepared_Swing obj=new Prepared_Swing();
			obj.callable();
	}
}