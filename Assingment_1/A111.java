// 11) Write a program to demonstrate use of anonymous inner class.

import javax.swing.JLabel;

public class A111  {
    


    public static void main(String ar[]
    ){
          new AFrame (){
            public void init()
            {
                add(new JLabel("Hello There This is Example of anonymous Inner Class ")); 
                setVisible(true); 
            }
          }.init(); 
    }
}
