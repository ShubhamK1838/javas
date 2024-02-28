// 10) Write a program to demonstrate use of any one Adapter class

import java.awt.event.*;
import javax.swing.*;

public class A110  extends AFrame {
    
    public A110()
    {
        add(new JLabel("Hello One Wellcome to Java Program ")); 
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent event)
            {
                
                int i=JOptionPane.showConfirmDialog(null, "Are You Sure ");
                if(i==0) System.exit(0); 
                else return ; 
                
                
            }
        }); 
        setVisible(true); 
    }

    public static void main(String ar[])
    {

        new A110(); 
    }
}
