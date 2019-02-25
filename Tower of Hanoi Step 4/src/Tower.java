
public class Tower {
	Disk d;
	
	void draw() {
		System.out.println("Drawing tower.");
		d.draw();
		
	}

	void addDisc(Disk disc) {
		System.out.println("Adding disk.");
		this.d=disc;
		
	}

}
