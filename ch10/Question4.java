package ch10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxEx extends JFrame{
	private JButton btn = new JButton("test button");
	public CheckBoxEx() {
		setTitle("CheckBox와 Item 이벤트 Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox on = new JCheckBox("버튼 비활성화");
		JCheckBox off = new JCheckBox("버튼 감추기");
		c.add(on);
		c.add(off);
		c.add(btn);
		
		on.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
					btn.setEnabled(false);
				else
					btn.setEnabled(true);
			}
		});
		off.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
					btn.setVisible(false);
				else
					btn.setVisible(true);
			}
		});
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxEx();
	}

}
