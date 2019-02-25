
public class PatternCalculator {
	int simplePattern(int n) {
		int total = 0;
		for (int x = 1; x <= n; x = x + 1) {
			total = total + x;

		}

		return total;
	}

}
