import java.io.*;
import java.net.*;


class ClientTwoWay
{
	public static void main(String args[])
	{
		try
		{
			Socket s=new Socket("localhost",6666);
			OutputStream obj=s.getOutputStream();
			PrintStream ps=new PrintStream(obj);
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
			String str,str1;
			while(!(str=kb.readLine()).equalsIgnoreCase("exit"))
			{
				ps.println(str);
				str1=br.readLine();
				System.out.println(str1);
			}
			ps.close();
			br.close();
			kb.close();
			s.close();
			s.close();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}