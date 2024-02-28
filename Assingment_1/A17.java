
import java.awt.*;
import java.applet.*;
// Write a program to create applet that uses getDocument Base()
public class A17 extends Applet {

    Image picture;

    public void init() {
        picture = getImage(getDocumentBase(), "java.png");
    }

    public void paint(Graphics g) {
        g.drawImage(picture, 30, 30, this);
    }
}
