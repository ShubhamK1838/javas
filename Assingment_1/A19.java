// 9) Write a program to handle mouse events.

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*; 



public class A19  extends AFrame{
    
    
    public A19()
    {
        setLayout(new FlowLayout()); 
        JLabel   message=new JLabel(); 
        
        this.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent event)
            {
                message.setText("Clicked Co-ordinate --> X:  "+event.getX()+" Y: "+event.getY()); 
            }
        }); 

        add(new JLabel("Click Anyhere  in Frame Using Mouse ")); 
        add(message); 

        setVisible(true); 
    }


    public static void main(String ar[])
    {
     var a=    new A19(); 
    }
}
