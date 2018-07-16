import java.sql.*;
import javax.swing.*;
class JavaBatchPrepareStatementSwings
{

	//void ask()
	//{
	//	String str2=JOptionPane.showInputDialog("Please enter company code");
	//	String str3=JOptionPane.showInputDialog("Please enter company name");
	//}
	public static void main(String args[])
	{
		try
		{
	//		JavaBatchPrepareStatementSwings ob=new JavaBatchPrepareStatementSwings();
			int i=0;
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/db1","scott","tiger");
			System.out.println("Successfully connected");
			conn.setAutoCommit(false);
			String sqlStr="insert into company values(?,?)";
	//		ob.ask();
			//String input=JOptionPane.showInputDialog("enter number of inputs");
			//i=(int)input;
			System.out.println("Enter number of inputs");
			int n=Integer.parseInt(System.console().readLine());
			PreparedStatement pst=conn.prepareStatement(sqlStr);
			while (i<n)
			{
				JOptionPane.showMessageDialog(null, "For"+(i+1)+"Row");
				String str2=JOptionPane.showInputDialog("Please enter company code");
				String str3=JOptionPane.showInputDialog("Please enter company name");

				pst.setString(1,str2);
				pst.setString(2,str3);
				pst.addBatch();
				i=i+1;

			}
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