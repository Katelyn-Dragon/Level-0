
public class ForLoopGauntlet {
	public static void main(String[] args) {
		int year = 2005;
		for (int i = 0; i < 12; i++, year++) {

			System.out.println("in year " + year + " I was " + i + " years old");
		}
		//
		for (int q = 0; q < 3; q++) {
			for (int w = 0; w < 3; w++) {
				System.out.println(q + " " + w);
			}

		}
		//

	}

	public ForLoopGauntlet() {
		// TODO Auto-generated constructor stub

	}

}
