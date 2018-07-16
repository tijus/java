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
			//attach a output stream to server socket
			OutputStream obj=s.getOutputStream();
			//For sending data to client
			PrintStream ps=new PrintStream(obj);

			//changes for server two way
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));

			while(true)
			{
				String str,str1;
				while((str=br.readLine()) != null)
				{
					System.out.println(str);
					str1=kb.readLine();
					ps.println(str1);

				}
				ps.close();
				br.close();
				kb.close();
				ss.close();
				s.close();
			}


		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}