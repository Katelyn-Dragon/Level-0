
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TeenageMutantNinjaTortoise {
	public static void main(String[] args) {

		// 3. ask the user what color they would like the tortoise to draw
		String answer = JOptionPane.showInputDialog("What color do you want the tortoise to use?");
		// 4. use an if/else statement to set the pen color that the user
		// requested
		if (answer.equals("Green")) {
			Tortoise.setPenColor(Color.GREEN);
		}
			if (answer.equals("magenta")) {
				Tortoise.setPenColor(Color.MAGENTA);
			}
			if(answer.equals("red")){
				Tortoise.setPenColor(Color.RED);
			}
			if(answer.equals("blue")){
				Tortoise.setPenColor(Color.BLUE);
			}
			;
	
		// 5. if the user doesn’t enter anything, choose a random color
			if(answer.equals(null)){
				Tortoise.setPenColor(Color.BLACK);
			}
				// 6. put a loop around your code so that you keep asking the user for
		// more colors & drawing them

		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the tortoise draw a shape (this will take more than one line
		// of code)
		for (int i = 0; i < 4; i++) {

			Tortoise.penDown();
			Tortoise.turn(90);
			Tortoise.move(200);

		}
	}
}
