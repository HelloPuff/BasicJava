
//Import stuff.
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;

public class TowerPanel extends JPanel {
	int numberOfDiscs;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Draw towers.
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.cyan);
		g.fillRect(155, 140, 25, 450);

		Graphics2D g3 = (Graphics2D) g;
		g3.setColor(Color.cyan);
		g.fillRect(15, 575, 300, 25);

		//Draw discs.
		if (numberOfDiscs == 1) {
			Disc d1 = new Disc(Color.blue, 40, 560, 250, 15);
			d1.draw(g);

		}else if(numberOfDiscs == 2){
			Disc d1 = new Disc(Color.blue, 40, 560, 250, 15);
			d1.draw(g);

			Disc d2 = new Disc(Color.green, 65, 545, 200, 15);
			d2.draw(g);
			
		}else if(numberOfDiscs == 3){
			Disc d1 = new Disc(Color.blue, 40, 560, 250, 15);
			d1.draw(g);

			Disc d2 = new Disc(Color.green, 65, 545, 200, 15);
			d2.draw(g);

			Disc d3 = new Disc(Color.red, 90, 530, 150, 15);
			d3.draw(g);
			
		}
	
	}
	
	//Removing disc.
	void removeDisc(){
		
		
	}
	
	//Adding disc.
	void addDisc(){
		
		
	}
	
	TowerPanel(){
		
		
	}

}
