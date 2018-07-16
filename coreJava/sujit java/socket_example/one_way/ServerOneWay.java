import java.io.*;
import java.net.*;

class ServerOneWay
{
	public static void main(String args[])
	{

		try
		{
			ServerSocket ss=new ServerSocket(6666);
			System.out.println("Server Ready");
			Socket s=ss.accept();

			OutputStream obj=s.getOutputStream();
			PrintStream ps=new PrintStream(obj);

			ps.println("Hello Client   ");
			ps.close();
			ss.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}