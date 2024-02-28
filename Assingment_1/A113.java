// 13) Design a form for simple arithmetic calculations(Use
// Swing components).

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class A113 extends AFrame {

    JButton operations[];
    JTextField field[]; 

    public A113() {
        setLayout(new FlowLayout());

        field=new JTextField[3]; 
        for(int i=0;i<field.length; i++)
        {
            add(field[i]=new JTextField());
            field[i].setPreferredSize(new Dimension(90,30));       
        }
        initOperations(); 
        setVisible(true);
    }

    void initOperations() {
        int i = 0;
        operations = new JButton[4];
        for (String ele : new String[] { "+", "-", "*", "/" }) {
           add( operations[i] = new JButton(ele));
            operations[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    setAns(field[0].getText(), field[1].getText(), event.getActionCommand().charAt(0));
                }
            });
        }
    }

    public void setAns(String a, String b, char c) {
        switch (c) {
            case '+':
                field[2].setText("" + (Integer.parseInt(a) + Integer.parseInt(b)));
                return;
            case '-':
            field[2].setText("" + (Integer.parseInt(a) - Integer.parseInt(b)));
                return;
            case '*':
            field[2].setText("" + (Integer.parseInt(a) * Integer.parseInt(b)));
                return;
            case '/':
            field[2].setText("" + (Integer.parseInt(a) / Integer.parseInt(b)));
                return;
        }
    }

    public static void main(String ar[]) {
        new A113();
    }
}
