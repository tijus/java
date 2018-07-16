import java.io.*;
import java.net.*;

class ServerTwoWay
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(6666);
			System.out.println("Server Ready");
			Socket s=ss.accept();

			DataInputStream din=new DataInputStream(s.getInputStream());
			String str=(String)din.readUTF();
			System.out.println("message: "+str);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}