package ch08;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
    public GridLayoutEx() {
        setTitle("4X4 Color Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,4));

        Container cp = getContentPane();

        JButton[] btn = new JButton[16];
        Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY,
                Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY};

        for(int i=0; i<16; i++){
            btn[i] = new JButton(Integer.toString(i));
            btn[i].setOpaque(true);
            btn[i].setBackground(color[i]);
            cp.add(btn[i]);
        }

        setVisible(true);
        setSize(500,220);
    }

    public static void main(String[] args){
        new GridLayoutEx();
    }
}
