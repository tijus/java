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
public class J_7_Storeproc_1{
	public static void main(String args[]) throws Exception
	{
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/db1","scott","tiger");
			CallableStatement stmt=conn.prepareCall("{call dept_count(?,?)}");
			stmt.setString(1,"CLERK");
			stmt.registerOutParameter(2,Types.INTEGER);

			stmt.executeUpdate();
			System.out.println("\n Method called from Java!\n");
			System.out.println(stmt.getInt(2)+"\n");
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