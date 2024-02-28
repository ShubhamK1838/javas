// 3)  Write a program to demonstrate InetAddress class. 

import java.net.*; 

public class A13 {
    
    public static void main(String ar []) throws Exception {
        
        var host="OMEN";  
        InetAddress ip=InetAddress.getByName("OMEN"); 
            Out.print("Host: "+host+"\nIP:"+ip); 
    }
}
