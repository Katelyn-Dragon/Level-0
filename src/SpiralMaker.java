// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;


import org.teachingextensions.logo.Tortoise;


public class SpiralMaker {


	public static void main(String[] args) {
		
		// 3. Make a variable to hold the number of sides and set it to 0
		int sides = 0;
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		String answer = JOptionPane.showInputDialog(null, "Which spiral would you like?");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		if(answer.equals("square")){
		sides = 360/4;
		}
		else if(answer.equals("triangle")){
			sides = 360/3;
		}
		else if(answer.equals("pentagon")){
			sides = 360/5;
		}
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't know how to draw a " + answer);
			System.exit(sides);
		}
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
		Tortoise Greeny = new Tortoise();
		for (int i = 0; i < 80; i++) {
	    Greeny.setSpeed(10);
	    Greeny.penDown();
	    Greeny.move(i*3);
	    Greeny.turn(sides);
	  
			
		
		
		
		// 2. Change your code to turn the square spiral into a triangle spiral
	}

	}
}
