
import java.awt.*;
import javax.swing.*;

public class Disc {
	// Make disc template.
	Color c;
	int x;
	int y;
	int width;
	int height;

	public void draw(Graphics g) {
		g.setColor(c);
		g.fillRect(x, y, width, height);

	}

	Disc(Color c, int x, int y, int width, int height) {
		this.c = c;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;

	}

}
