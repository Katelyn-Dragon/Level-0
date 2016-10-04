
	// Copyright Wintriss Technical Schools 2013
	import javax.swing.JOptionPane;

	public class SleepyHead {

		public static void main(String[] args) {
			
			
				
			
			boolean isWeekday, isVacation;
			
			
			 //Ask the user for these values using
			 int answer =JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
			 JOptionPane.YES_NO_OPTION);
			 int answer2 = JOptionPane.showConfirmDialog(null, "Is it a vacation?");
			if (answer2==JOptionPane.NO_OPTION) {
				isVacation = false;
				System.out.println("GET UP LAZY BONES!");
			
			}	
			else {
				isVacation = true;
				System.out.println("You can sleep in.");
			}
			if (answer==JOptionPane.NO_OPTION) {
				isVacation = false;
				System.out.println("You can sleep in.");
			}
			else {
				isVacation = true;
				System.out.println("GET UP LAZY BONES!");
			}

			
			 /*Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
			 * print “get up lazy bones!” If it is a weekday, and we are on vacation,
			 * print “sleep in”.
			*/
			
		}
	}

	
