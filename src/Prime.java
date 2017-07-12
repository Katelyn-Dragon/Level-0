import javax.swing.JOptionPane;

public class Prime {
	public static void main(String[] args) {

		String Number = JOptionPane.showInputDialog("Give me a number");
		boolean isPrime = true;
		int prime = Integer.parseInt(Number);
		for (int i = 2; i < prime; i++) {
			if (i % 1 == 0 && prime % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
}
