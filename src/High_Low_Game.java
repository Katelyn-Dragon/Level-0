import java.util.Random;

import javax.swing.JOptionPane;

public class High_Low_Game {
	public static void main(String[] args) {
		Random Jin = new Random();
		int Random = Jin.nextInt(100);
		for (int i = 0; i < 10; i++) {

			String number = JOptionPane.showInputDialog("Choose a number between 1-100");
			int number1 = Integer.parseInt(number);
			if (number1 < Random) {
				JOptionPane.showMessageDialog(null, "Number is too low");
			} else if (number1 > Random) {
				JOptionPane.showMessageDialog(null, "Number is too high");
			} else if (number1 == Random) {
				JOptionPane.showMessageDialog(null, "You got it correct");
				break;
			}
			{

			}
		}
	}

}
