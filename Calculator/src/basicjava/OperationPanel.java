package basicjava;

import java.awt.Font;

import java.awt.Color;

import java.awt.GridLayout;

import javax.swing.*;

public class OperationPanel extends JPanel{
	OperationPanel(){
		// Create layout with 5 rows 1 column
		GridLayout layout = new GridLayout(5, 1);
		// Setting Layout
		setLayout(layout);
		Font font = new Font("Serif", Font.BOLD, 66);
		
		// create '+' button
		JButton plusButton = new JButton("+");
		plusButton.setFont(font);
		// add this to panel
		super.add(plusButton);
				
		// create '-' button
		JButton minusButton = new JButton("-");
		minusButton.setFont(font);
		// add this to panel
		super.add(minusButton);
		
		// create '*' button
		JButton multiplyButton = new JButton("*");
		multiplyButton.setFont(font);
		// add this to panel
		super.add(multiplyButton);
		
		// create '/' button
		JButton divideButton = new JButton("/");
		divideButton.setFont(font);
		// add this to panel
		super.add(divideButton);
		
		// create '=' button
		JButton equalButton = new JButton("=");
		equalButton.setFont(font);
		// add this to panel
		super.add(equalButton);
		
		
	}

}
