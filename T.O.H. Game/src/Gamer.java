
//Import stuff.
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;

public class Gamer {
	TowerPanel t1;
	TowerPanel t2;
	TowerPanel t3;
	
	void create() {
		// Make frame.
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Make tower panels.
		t1 = new TowerPanel();
		t1.setBackground(Color.black);
		t1.numberOfDiscs = 3;

		t2 = new TowerPanel();
		t2.setBackground(Color.darkGray);
		t2.numberOfDiscs = 0;
		
		t3 = new TowerPanel();
		t3.setBackground(Color.gray);
		t3.numberOfDiscs = 0;

		// Add tower panels to the frame.
		f.add(t1);
		f.add(t2);
		f.add(t3);

		// Organize/set layout.
		GridLayout g = new GridLayout(1, 3);

		f.setLayout(g);

		f.setVisible(true);

	}

	boolean move() {
		t1.removeDisc();
		t2.addDisc();

		return true;
	}

}
