package ch08;

import java.awt.*;

import javax.swing.*;

public class MultiPanelFrame extends JFrame {
	private SouthPanel southPanel = new SouthPanel();
	private CenterPanel centerPanel = new CenterPanel();
	private NorthPanel northPanel = new NorthPanel();
	
	public MultiPanelFrame() {
		super("3개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(southPanel, BorderLayout.SOUTH);
		c.add(centerPanel, BorderLayout.CENTER);
		c.add(northPanel, BorderLayout.NORTH);
		
		setSize(300,250);
		setVisible(true);
		
		centerPanel.draw();
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
		}

		public void draw() {
			for(int i=0; i<count; i++) {
				JLabel l = new JLabel("*");
				l.setSize(20,20);
				l.setForeground(Color.RED);
				l.setLocation((int)(Math.random()*(this.getWidth()-20)), (int)(Math.random()*(this.getHeight()-20)));
				add(l);
			}
		}
	}
	
	public static void main(String[] args) {
		new MultiPanelFrame();
	}

}

