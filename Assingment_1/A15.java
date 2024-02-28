import java.applet.Applet;
import java.awt.Graphics;

// Write  program of java which  demonstrate display message in  applet 

public class A15  extends Applet{
    
    
    private String messge;
    public void init()
    {
        messge="Hello Java"; 
    }
    public void paint(Graphics g)
    {
        g.drawString(messge, 30,30); 

    }
    


}
