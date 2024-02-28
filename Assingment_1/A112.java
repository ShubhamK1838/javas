// 
// 12) Write a program to demonstrate use of text event.

import javax.swing.JLabel;
import java.awt.*; 
import java.awt.event.*;

public class A112 extends AFrame implements TextListener {

    private TextField text;
    private JLabel name;

    public A112() {
        setLayout(new FlowLayout());
        text = new TextField();
        text.addTextListener(this);
        text.setPreferredSize(new Dimension(90, 40));
        add(new JLabel("Enter Your Name "));
        add(text);
        add(name = new JLabel());
        setVisible(true);
    }

    public void textValueChanged(TextEvent event) {
        name.setText("Your Name :" + text.getText());
    }

    public static void main(String ar[]) {

        new A112();

    }

}
