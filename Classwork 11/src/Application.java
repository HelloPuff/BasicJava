
public class Application {

	public static void main(String[] args) {
		BMW b1 = new BMW();
		b1.start();
		b1.stop();
		b1.beSafe();
		
		BMWSportCar bs1 = new BMWSportCar();
		bs1.super.start();
		bs1.start();
		bs1.stop();
		bs1.beSafe();
		
		Honda h1 = new Honda();
		h1.start();
		h1.stop();
		h1.beSafe();
		
		Toyota t1 = new Toyota();
		t1.start();
		t1.stop();
		t1.beSafe();
		
		
	}

}
