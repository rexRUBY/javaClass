package ch08;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutPractice extends JFrame {
    public FlowLayoutPractice(){
        setTitle("FlowLayout Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        Container cp = getContentPane();
        cp.add(new JLabel("100"));
        cp.add(new JLabel(" + 200"));
        cp.add(new JButton("="));
        cp.add(new JLabel("300"));

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args){
        new FlowLayoutPractice();
    }
}
