import java.awt.*;
public class Application {

	public static void main(String[] args) {
		Frame f1 = new Frame("Aayush Neil Surya's Window!!!");
		f1.setVisible(true);
		f1.setSize(500, 500);
		Label l1 = new Label("Aayush Neil Surya is happy!!!");
		f1.add(l1);
		f1.setBackground(Color.BLUE);
		Label l2 = new Label("Aayush Neil Surya is still happy!!!");
		f1.add(l2);

	}

}
