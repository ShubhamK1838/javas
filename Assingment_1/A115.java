// 15) Write the following program using Swing component.
// An Election is conducted between 3 candidates. There are N number of voters. 
// By clicking Next Voter Button textboxes and Radio Buttons need to be cleared. By 
// clicking Results, the votes obtained by each candidate and the winner candidate to be
// displayed in text area. Exit button should e

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class A115 extends AFrame {
    int candidates_votes[];
    JRadioButton candidates[];
    JPanel top, bottom;
    ActionListener listener;
    JButton submit, result;

    public A115() {
        candidates_votes = new int[3];
        candidates = new JRadioButton[3];
        ButtonGroup group = new ButtonGroup();
        listener = new ActionListener() {
            public void actionPerformed(ActionEvent event) {

                String st = null;
                for (int i = 0; i < candidates.length; i++) {
                    if (candidates[i].isSelected()) {
                        st = candidates[i].getText();
                    }
                }
                if (st == null)
                    return;
                String text = st;
                int ind = Integer.parseInt("" + text.charAt(text.length() - 1));
                candidates_votes[ind]++;

                group.clearSelection();

            }

        };
        submit = new JButton("Submit");
        submit.addActionListener(listener);

        top = new JPanel();
        for (int i = 0; i < candidates.length; i++) {

            top.add(candidates[i] = new JRadioButton("Candidate " + i));
            group.add(candidates[i]);

        }

        bottom = new JPanel();
        bottom.setLayout(new FlowLayout(0, 90, 30));
        result = new JButton("Result");
        result.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bottom.removeAll();
                int max = 0;
                for (int i = 0; i < candidates.length; i++) {
                    bottom.add(new JLabel(candidates[i].getText() + " : " + candidates_votes[i]));

                    if (candidates_votes[i] > candidates_votes[max])
                        max = i;
                }

                bottom.add(new JLabel("Winner " + candidates[max].getText()));

                bottom.revalidate();
            }
        });

        top.add(submit);
        top.add(result);
        add(top, BorderLayout.NORTH);
        add(bottom, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String ar[]) {
        new A115();
    }
}