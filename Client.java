import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		DatagramSocket Ds=new DatagramSocket();
		InetAddress ip=InetAddress.getLocalHost();
		byte buf[]=null;
		while(true)
		{
			String inp=sc.nextLine();
			buf=inp.getBytes();
			DatagramPacket Dp_send=new DatagramPacket(buf,buf.length,ip,1234);
			Ds.send(Dp_send);
			if(inp.equals("bye"))
				break;
		}
	}
}

 
