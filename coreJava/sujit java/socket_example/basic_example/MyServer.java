import java.io.*;
import java.net.*;

class MyServer
{

	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(6666);
			System.out.println("Server Ready");
			Socket sq=ss.accept();

			DataInputStream din=new DataInputStream(sq.getInputStream());
			String str=(String)din.readUTF();
			System.out.println("message"+str);
			ss.close();
		}

		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}