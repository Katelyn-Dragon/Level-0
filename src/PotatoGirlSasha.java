import javax.swing.JOptionPane;

public class PotatoGirlSasha {

	public PotatoGirlSasha() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		for (int s = 0; s < 5; s++) {

			for (int i = 1; i < 9; i++) {
				if (i == 1) {
					System.out.print(i + " potato, ");
				} else if (i == 4) {
					System.out.println(i + ", ");
				} else if (i == 8) {
					System.out.println("more!");
				} else {

					System.out.print(i + " potatoes, ");
				}
			}
			System.out.println();
		}
	}

}
