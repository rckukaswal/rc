package selfpractice;

public class S6 {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {

			if (i > 70) {

				System.out.println(i + "Maximum Capacity");
			} else if (i > 60) {

				System.out.println(i + "Running Fan 2100 RPM + Liquid cooller");
			}

			else if (i > 50) {
				System.out.println(i + "Running Fan 2100 RPM");
			}

			else if (i > 40) {
				System.out.println(i + "Running Fan 1100 RPM");
			}

			else {
				System.out.println(i + "Normal");
			}
		}

	}
}