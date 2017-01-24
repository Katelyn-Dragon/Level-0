import javax.swing.JOptionPane;

public class GradeChecker {
public static void main(String[] args) {
	String number = JOptionPane.showInputDialog("Choose a number from 0-100 pleaseu");
	int answer = Integer.parseInt(number);
	if (answer<0&&answer>100) {
		JOptionPane.showMessageDialog(null, "ERROR");
	}
	else if (answer>=90&&answer<=100) {
		JOptionPane.showMessageDialog(null,"Your grade is an A!");
	}
	else if (answer<=89&&answer>=80) {
		JOptionPane.showMessageDialog(null, "You have a B");
	}
	else if(answer>=70&&answer<=79) {
		JOptionPane.showMessageDialog(null, "You have a C");
	}
	else if (answer>=60&&answer>=69){
		JOptionPane.showMessageDialog(null, "You have a D");
	}
	else if (answer>=0&&answer<=59) {
		JOptionPane.showMessageDialog(null, "You have an F D:");
	}
}
}

