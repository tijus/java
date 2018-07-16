import java.io.*;
import java.net.*;


class ClientOneWay
{
	public static void main(String args[])
	{
		try
		{
			Socket s=new Socket("localhost",6666);
			InputStream obj=s.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(obj));
			String str;
			while((str=br.readLine()) != null)
				System.out.println("I am Client. Got message from Server "+str);

			br.close();
			s.close();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}