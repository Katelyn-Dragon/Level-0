import javax.swing.JOptionPane;

public class MATH {
public static void main(String[] args) {
	String number = JOptionPane.showInputDialog("Choose a number!");
	String number1 = JOptionPane.showInputDialog("Choose another number!");
	int number2 = Integer.parseInt(number);
	int number3 = Integer.parseInt(number1);
	int sum = number2 + number3;
	JOptionPane.showMessageDialog(null, "The answer is " + sum);
}
}
