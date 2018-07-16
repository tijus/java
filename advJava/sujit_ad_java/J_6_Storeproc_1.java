/*
create or replace procedure dept_avgsal
(vdeptno in number, avgsal out number)
as
begin
Select avg(sal) into avgsal
from emp
where deptno=vdeptno;
end;
/
*/

/*set serveroutput on;

declare
 t number(6);
begin
 insertR(10, t);
 dbms_output.put_line(t);
end;
/
*/

import java.sql.*;
public class J_6_Storeproc_1{
	public static void main(String args[]) throws Exception
	{
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/db1","scott","tiger");
			CallableStatement stmt=conn.prepareCall("{call dept_avgsal(?,?)}");
			stmt.setInt(1,10);
			stmt.registerOutParameter(2,Types.FLOAT);

			stmt.executeUpdate();
			System.out.println("\n Method called from Java!\n");
			System.out.println(stmt.getFloat(2)+"\n");
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