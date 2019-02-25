
public class Application {

	public static void main(String[] args) {
		DiskManager m1 = new DiskManager();

		Disc d1 = m1.getSmall();
		System.out.println(d1.getSize());
		Disc d2 = m1.getMedium();
		System.out.println(d2.getSize());
		Disc d3 = m1.getLarge();
		System.out.println(d3.getSize());

	}

}
