import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class A114 extends JFrame implements ActionListener {
    private JTextField[] inFs;
    private JTextField sIF, cIF;
    private JButton cB;

    public A114() {
        setTitle("Interest Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] labels = { "Prin:", "Rate:", "Time:" };
        inFs = new JTextField[labels.length];
        for (int i = 0; i < labels.length; i++) {
            add(new JLabel(labels[i]));
            inFs[i] = new JTextField(10);
            add(inFs[i]);
        }

        sIF = new JTextField(10);
        sIF.setEditable(false);
        add(new JLabel("Simple Interest:"));
        add(sIF);

        cIF = new JTextField(10);
        cIF.setEditable(false);
        add(new JLabel("Compound Interest:"));
        add(cIF);

        cB = new JButton("Calc");
        cB.addActionListener(this);
        add(cB);

        setVisible(true);
    }

    public static void main(String[] args) {
        new A114();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double[] values = new double[inFs.length];
        for (int i = 0; i < inFs.length; i++) {
            values[i] = Double.parseDouble(inFs[i].getText());
        }

        double p = values[0], r = values[1], t = values[2];
        double sI = (p * r * t) / 100;
        double cI = p * Math.pow((1 + r / 100), t) - p;

        sIF.setText(String.valueOf(sI));
        cIF.setText(String.valueOf(cI));
    }
}
