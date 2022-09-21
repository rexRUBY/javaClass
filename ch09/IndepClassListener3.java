package ch09;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame{
	IndepClassListener(){
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		
		btn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
			}
		}); //액션 리스너를 붙여줌
		
		c.add(btn);
		setSize(250,120);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new IndepClassListener();
	}
}