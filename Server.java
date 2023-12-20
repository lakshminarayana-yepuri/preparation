import java.io.IOException;
import java.net.InetAddress;
import java.net.DatagramSocket;
import java.net.DatagramPacket;

public class Server{
	public static void main(String args[]) throws IOException{
		DatagramSocket ds=new DatagramSocket(1234);
		byte[] receive=new byte[65535];
		DatagramPacket Dp_receive=null;
		while(true){
			Dp_receive=new DatagramPacket(receive,receive.length);
			ds.receive(Dp_receive);
			System.out.println("client:-"+ data(receive));
			if(data(receive).toString().equals("bye")){
				System.out.println("client sent bye....EXITING");
				break;
			}
			receive=new byte[65535];
		}
}
	public static StringBuilder data(byte[] a){
		if(a==null)
			return null;
		StringBuilder ret=new StringBuilder();
		int i=0;
		while(a[i]!=0){
			ret.append((char) a[i]);
			i++;
		}
	return ret;
	}
}
