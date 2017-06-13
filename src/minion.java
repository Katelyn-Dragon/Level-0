
import java.util.Random;

import javax.swing.JOptionPane;

public class minion {
	/*
	 * + * Minion.java + * + * You met a minion who is banana for fruits (no
	 * puns intended...)! Ask them for + * their name and they will yell a kind
	 * of fruit x times, where x is a random + * number between 1 and 20. But if
	 * you ended up asking Gru what his favorite + * fruit, he would say,
	 * "I don't like fruits!". + * + * + * 1. Ask your minion what their name
	 * is? (hint: use JOptionPane) + * 2. Ask your minion what their favorite
	 * fruit is? + * 3. Get a number between 1 and 20. + * 4. Make the minion go
	 * crazy and say their favorite fruit names over and over! + * 5. But
	 * remember that Gru doesn't like fruits! +
	 */
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		Random rand = new Random();
		int randNUm = rand.nextInt(20);
		String fruit = JOptionPane.showInputDialog("What is your favorite fruit?");
		if (name.equals("Gru")) {
			System.out.println("I don't like fruits!");
		} else {
			for (int i = 0; i < randNUm; i++) {
				System.out.println(fruit);
			}
		}
	}
}