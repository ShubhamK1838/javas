import java.applet.Applet;
// 6) Write a program to create parameterized applet.
import java.awt.Graphics;

/* 
<applet code="A16.class" width="300" height="300"> 
</applet> 
*/  

public class A16 extends Applet {

    public void paint(Graphics g) {
        String str = getParameter("msg");
        g.drawString(str, 50, 50);
    }

}
