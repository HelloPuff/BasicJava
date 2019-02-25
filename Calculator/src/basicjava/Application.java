package basicjava;

import java.awt.Color;

import java.awt.GridLayout;

import javax.swing.*;

public class Application {

	public static void main(String[] args) {
		JFrame f1 = new JFrame("Calculator");
		f1.setSize(1000, 1000);
		f1.setBackground(Color.BLACK);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		NumberPanel n1 = new NumberPanel();
		
		OperationPanel o1 = new OperationPanel();
		
		ResultPanel r1 = new ResultPanel();
		
		ResultPanel dummyPanel = new ResultPanel();
		
		f1.add(r1);
		f1.add(dummyPanel);
		f1.add(n1);
		f1.add(o1);
		
		GridLayout g1 = new GridLayout(2, 2);
		f1.setLayout(g1);
		f1.setVisible(true);
		
	}

}
