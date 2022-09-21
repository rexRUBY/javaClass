package ch08;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutPractice extends JFrame {
    public BorderLayoutPractice(){
        setTitle("BorderLAyout Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        setLayout(new BorderLayout(50,5));

        cp.add(new JButton("North"), BorderLayout.NORTH);
        cp.add(new JButton("West"), BorderLayout.WEST);
        cp.add(new JButton("Center"), BorderLayout.CENTER);
        cp.add(new JButton("East"), BorderLayout.EAST);
        cp.add(new JButton("South"), BorderLayout.SOUTH);

        setVisible(true);
        setSize(500,300);
    }

    public static void main(String[] args){
        new BorderLayoutPractice();
    }
}
