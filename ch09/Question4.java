package ch09;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Question4 extends JFrame{
    public Question4() {
        JLabel label = new JLabel("Love Java");
        setTitle("+ - 키로 폰트 조절하기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        label.setFont(new Font("Arial", Font.PLAIN, 20));
        c.add(label);
        label.addKeyListener(new MyKeyAdaptor());

        label.setFocusable(true); //컨텐트팬이 포커스를 받을 수 있도록 설정
        label.requestFocus(); //컨텐트팬에 포커스 설정. 키 입력 가능해짐
        setSize(300,250);
        setVisible(true);
    }

    class MyKeyAdaptor extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            JLabel la = (JLabel) e.getSource();
            Font f = la.getFont();
            int size = f.getSize();
            if(e.getKeyChar()=='+') {
                la.setFont(new Font("Arial",Font.PLAIN, size+5));
            }
            else if(e.getKeyChar()=='-') {
                if(size <=5)
                    return;
                la.setFont(new Font("Arial",Font.PLAIN, size-5));
            }
        }
    }

    public static void main(String[] args) {
        new Question4();
    }
}
