import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Question3 extends JFrame {
    public Question3() {
        setTitle("드래깅동안 YELLOW로 변경");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setBackground(Color.GREEN);
        MyMouseListener ml = new MyMouseListener();
        c.addMouseListener(ml);
        c.addMouseMotionListener(ml);
        setSize(300,200);
        setVisible(true);
    }

    class MyMouseListener extends MouseAdapter{
        public void mouseDragged(MouseEvent e) {
            Container c = (Container) e.getSource();
            c.setBackground(Color.YELLOW);
        }

        public void mouseReleased(MouseEvent e) {
            Container c = (Container) e.getSource();
            c.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args){
        new Question3();
    }
}
