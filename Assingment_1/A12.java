// ) Write a program to demonstrate URL class

import java.net.*;  

public class A12 {

    public static void main( String ar[])
throws Exception 
    {


            URL url=new URL("https://docs.oracle.com/en/java/javase/21/"); 
        
            Out.print("Protocol: "+ url.getProtocol()); 
            Out.print("Host: "+url.getHost()); 
            Out.print("Path: "+url.getPath()); 
            Out.print("Port:"+url.getPort()); 


    
        }

        

}
