import javax.swing.JOptionPane;

public class BowlingScore {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What Is Your Best Bowling Score?");
		int score1 = Integer.parseInt(score);
		if (score1 <= 99 && score1 >= 0) {
			JOptionPane.showMessageDialog(null, "You Should Practice More");
		} else if (score1 >= 100 && score1 <= 199) {
			JOptionPane.showMessageDialog(null, "You Are Good");
		}
		else if (score1 >= 200 && score1 <= 300) {
			JOptionPane.showMessageDialog(null, "You Are A Pro");
		}
		else {
			JOptionPane.showMessageDialog(null, "That's Impossible, Liar");
		}
	}
}
