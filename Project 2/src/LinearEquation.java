
public class LinearEquation {
	int slope;
	int constant;

	LinearEquation(int slope, int constant) {
		this.slope = slope;
		this.constant = constant;
	}

	int getYCoordinate(int x) {
		int y;
		y = this.slope * x + this.constant;

		return y;
	}

}
