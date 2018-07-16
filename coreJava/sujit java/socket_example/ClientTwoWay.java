import java.io.*;
import java.net.*;

class ClientTwoWay
{
	public static void main(String args[])
	{
		try
		{
			Socket s=new Socket("localhost",6666);



			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello World");
			dout.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}