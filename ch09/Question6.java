package ch09;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Question6 extends JFrame {
    public Question6() {
        setTitle("3*4 Color Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(4,3));
        JLabel[] la = new JLabel[12];

        for(int i=0; i<12; i++){
            la[i]=new JLabel(Integer.toString(i));
            la[i].setBackground(Color.WHITE);
            la[i].addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    JLabel label = (JLabel)e.getSource();

                    int r = (int) (Math.random()*256);
                    int g = (int) (Math.random()*256);
                    int b = (int) (Math.random()*256);

                    label.setOpaque(true);
                    label.setBackground(new Color(r,g,b));
                }
            });
            c.add(la[i]);
        }
        setSize(300,250);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Question6();
    }
}
