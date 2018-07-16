
/*
 create or replace procedure cred
 (vjob in varchar2, vdate  in date, vsal  out number)
 as
 begin
 Select sal into vsal
 from emp
 where JOB=vjob AND HIREDATE > vdate;
end;
/
*



 declare
  t number(6);
 begin
  cred('SALESMAN','08-SEP-81', t);
  dbms_output.put_line(t);
 end;
 /

*/


import java.sql.*;
public class Storeproc_JOB_DATE{
	public static void main(String args[]) throws Exception
	{
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/db1","scott","tiger");
			Date date=new Date(0000-00-00);
			CallableStatement stmt=conn.prepareCall("{call cred(?,?,?)}");
			stmt.setString(1,"SALESMAN");
			stmt.setDate(2,date.valueOf("1981-09-08"));
			stmt.registerOutParameter(3,Types.INTEGER);

			stmt.executeUpdate();
			System.out.println("\n Method called from Java!\n");
			System.out.println(stmt.getInt(3)+"\n");
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