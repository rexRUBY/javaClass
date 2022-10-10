package ch09;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Question5 extends JFrame {
    public Question5() {
        setTitle("클릭 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        JLabel label = new JLabel("C");
        label.setLocation(50,50);
        label.setSize(20,20);
        label.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                JLabel la = (JLabel)e.getSource();
                Container c = la.getParent();
                int xBound = c.getWidth()-la.getWidth();
                int yBound = c.getHeight()-la.getHeight();
                int x = (int)(Math.random()*xBound);
                int y = (int)(Math.random()*yBound);
                la.setLocation(x,y);
            }
        });
        c.add(label);
        setSize(250,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Question5();
    }
}
