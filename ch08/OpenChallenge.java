package ch08;
import java.awt.*;
import javax.swing.*;

public class OpenChallenge extends JFrame {
	public OpenChallenge() {
		setTitle("Open Challenge 8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new NorthPanel(), BorderLayout.NORTH);
		add(new CenterPanel(), BorderLayout.CENTER);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new OpenChallenge();
	}
}

class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.gray);
		setLayout(new FlowLayout());
		add(new JButton("Open"));
		add(new JButton("Read"));
		add(new JButton("Close"));
	}
}

class CenterPanel extends JPanel {
	public CenterPanel() {
		setLayout(null);
		
		JLabel a = new JLabel("Hello Java!");
		a.setSize(100,20);
		a.setLocation(100,50);
		add(a);
	}
}
