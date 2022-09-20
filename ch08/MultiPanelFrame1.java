package ch08;

import java.awt.*;

import javax.swing.*;

public class MultiPanelFrame1 extends JFrame {
	private SouthPanel southPanel = new SouthPanel();
	private NorthPanel northPanel = new NorthPanel();
	
	public MultiPanelFrame() {
		super("3개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(southPanel, BorderLayout.SOUTH);
		c.add(northPanel, BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		
		setSize(300,250);
		setVisible(true);
	}

	class NorthPanel extends JPanel {
		public NorthPanel() {
			setBackground(Color.YELLOW);
			setOpaque(true);
			setLayout(new FlowLayout());
			add(new JButton("새로 배치"));
			add(new JButton("종료"));
		}
	}

	class SouthPanel extends JPanel {
		public SouthPanel() {
			setBackground(Color.LIGHT_GRAY);
			setOpaque(true);
			setLayout(new FlowLayout(FlowLayout.LEFT));
			add(new JButton("별 개수 수정"));
			add(new JTextField(15));
		}
	}

	class CenterPanel extends JPanel {
		private int count = 10;
		
		public CenterPanel() {
			setBackground(Color.WHITE);
			setLayout(null);
			
			for(int i=0; i<count; i++) {
				JLabel l = new JLabel("*");
				l.setSize(20,20);
				l.setForeground(Color.RED);
				int x = (int)(Math.random()*280);
				int y = (int)(Math.random()*230);
				l.setLocation(x,y);
				add(l);
			}
		}
	}
	
	public static void main(String[] args) {
		new MultiPanelFrame();
	}

}
