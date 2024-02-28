
// Write a program to demonstrate use of Datagram Socket.
import java.net.*;

public class A14 {

    public static void client(String msg) throws Exception {

        DatagramSocket ds = new DatagramSocket();
        String str = msg;
        InetAddress ip = InetAddress.getByName("OMEN");
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 2024);
        ds.send(dp);
        ds.close();

    }

    static public void server() throws Exception
    {
    DatagramSocket ds = new DatagramSocket(2024);  
    byte[] buf = new byte[1024];  
    DatagramPacket dp = new DatagramPacket(buf, 1024);  
    ds.receive(dp);  
    String str = new String(dp.getData(), 0, dp.getLength());  
    System.out.println(str);  
    ds.close();  

    }
    public static void main(String ar[])
 throws Exception
     {
        if(ar[0].equals("client"))
        client("hello This From Client_1..."); 
        else 
        server();

    }
}
