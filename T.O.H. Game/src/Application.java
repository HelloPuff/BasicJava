
//Import stuff.
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;

public class Application {

	public static void main(String[] args) {
		Gamer g1 = new Gamer();
		g1.create();
		JOptionPane.showMessageDialog(null, "About to remove disc.", "Neil", JOptionPane.INFORMATION_MESSAGE);
		g1.move();
		
		
	}
	

}
