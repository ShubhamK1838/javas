import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


import javax.swing.*; 

// Write a program to handle keyboard events

public class A18  extends AFrame {

    private JLabel text; 
    public A18()
    {
        setLayout(new FlowLayout()); 
        setFocusable(true);
        text=new JLabel(); 
        text.setFont(new Font("Arial",Font.PLAIN,30)); 
        text.setPreferredSize(new Dimension(90,30)); 
      
        this.addKeyListener(new KeyAdapter()
        {
                public void keyTyped(KeyEvent e)
                {
                    text.setText(""+e.getKeyChar()); 
                }
        });  
        // this.setFocusable(true); 
        add(new JLabel("Press Key : ")); 
        add(text); 
        setVisible(true); 
    }
    

    public static void main(String ar[])
    {
        new A18(); 

    }

}
