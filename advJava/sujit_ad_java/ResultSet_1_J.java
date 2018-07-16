import java.sql.*;

class ResultSet_1_J
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/db1","scott","tiger");
			Statement s=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=s.executeQuery("Select empno,ename,sal from emp");

			//absolute method
			rs.absolute(4);
			System.out.println("\n Row no should be 4: row no="+rs.getRow());
			System.out.println(" "+rs.getInt("empno")+" "+rs.getString("ename")+" "+rs.getInt("sal"));
			System.out.println("--------------------------------------------------------------------------");

			rs.relative(-1);
			System.out.println("\n Row no should be 3: row no="+rs.getRow());
			System.out.println(" "+rs.getInt("empno")+" "+rs.getString("ename")+" "+rs.getInt("sal"));
			System.out.println("--------------------------------------------------------------------------");

			rs.absolute(2);
			System.out.println("\n Row no should be 2: row no="+rs.getRow());
			System.out.println(" "+rs.getInt("empno")+" "+rs.getString("ename")+" "+rs.getInt("sal"));
			System.out.println("--------------------------------------------------------------------------");

			rs.last();
			System.out.println("\n Row no last: row no="+rs.getRow());
			System.out.println(" "+rs.getInt("empno")+" "+rs.getString("ename")+" "+rs.getInt("sal"));
			System.out.println("--------------------------------------------------------------------------");

			rs.afterLast();
			System.out.println("\n Row no after last: row no="+rs.getRow());
			System.out.println(" "+rs.getInt("empno")+" "+rs.getString("ename")+" "+rs.getInt("sal"));
			System.out.println("--------------------------------------");

			while(rs.previous())
			{
				System.out.println(" "+rs.getInt("empno")+" "+rs.getString("ename")+" "+rs.getInt("sal"));
			}

			rs.first();
			System.out.println("\n Row no first: row no="+rs.getRow());
			System.out.println(" "+rs.getInt("empno")+" "+rs.getString("ename")+" "+rs.getInt("sal"));
			System.out.println("--------------------------------------------------------------------------");

			rs.beforeFirst();
			System.out.println("\n Row no before first: row no="+rs.getRow());
			System.out.println(" "+rs.getInt("empno")+" "+rs.getString("ename")+" "+rs.getInt("sal"));
			System.out.println("--------------------------------------");

			while(rs.next())
			{
				System.out.println(" "+rs.getInt("empno")+" "+rs.getString("ename")+" "+rs.getInt("sal"));
			}



			rs.close();
			s.close();
			conn.close();
		}

		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}