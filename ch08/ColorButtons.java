package ch08;

import javax.swing.*;
import java.awt.*;

public class ColorButtons extends JFrame {
    public ColorButtons() {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,10));

        Container cp =getContentPane();
        JButton[] btn = new JButton[10];
        Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY};

        for(int i=0; i<10; i++){
            btn[i] = new JButton(Integer.toString(i));
            btn[i].setOpaque(true);
            btn[i].setBackground(color[i]);
            cp.add(btn[i]);
        }

        setVisible(true);
        setSize(500,300);
    }

    public static void main(String[] args){
        new ColorButtons();
    }
}
