import java.awt.*;
public class Application {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.print(java.lang.Math.PI);
		
		Frame f1 = new Frame("First Graphics Attempt!!!");
		f1.setSize(1000, 1000);
		f1.setVisible(true);
		
		Math m1 = new Math("Absolute Value!!!");
		
		int[]favoriteNumber = new int[5];
		favoriteNumber[2] = 10;
		System.out.println(favoriteNumber[2]);

	}

}
