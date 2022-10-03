package ch08;
import javax.swing.*;

public class JFramePractice extends JFrame{
	public JFramePractice() {
		setTitle("Let's study Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new JFramePractice();
	}
}
