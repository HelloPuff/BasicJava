package basicjava;

import java.awt.Color;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.*;

public class NumberPanel extends JPanel implements ActionListener{
	// Going to create number panel.
	NumberPanel() {
		setBackground(Color.BLUE);
		setSize(500, 550);

		// Going to create buttons.
		for (int x = 0; x < 10; x = x + 1) {
			JButton b1 = new JButton();
			String num = Integer.toString(x);
			b1.setText(num);
			b1.setSize(100, 110);
			b1.setBackground(Color.GREEN);
			b1.addActionListener(this);
			add(b1);
		}
		
		GridLayout g1 = new GridLayout(4, 3);
		setLayout(g1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = e.getActionCommand();
		JOptionPane.showMessageDialog(null, text);
	}

}
