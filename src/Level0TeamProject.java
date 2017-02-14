import javax.swing.JOptionPane;

public class Level0TeamProject {
	public static void main(String[] args) {
		String death = JOptionPane.showInputDialog(
				"Choose A Number/Option:\n 1. Add two numbers \n 2.Calculate Change \n 3. Print Message \n 4. Exit");
		int living = Integer.parseInt(death);
		if (living == 1) {

			String sub = JOptionPane.showInputDialog("Choose a number");
			int add = Integer.parseInt(sub);

			String subtraction = JOptionPane.showInputDialog("Choose another number");
			int addition = Integer.parseInt(subtraction);
			
		int	addition1 = add + addition;
		JOptionPane.showMessageDialog(null, addition1);
		}
	if(living == 2){
		String dumbo = JOptionPane.showInputDialog("what is the price for the dumb item you bought??????? \n I NEED TO KNOW!!!!!!!");
		String dumbo2 = JOptionPane.showInputDialog("what is the price you paid and wasted the money you could have bought a ice cream cone yeah ..... I like ice cream cones");
		double dumbo1 = Double.parseDouble(dumbo);
	  double dumbo3 = Double.parseDouble(dumbo2);
	double dumboSuperior = dumbo3 - dumbo1;
		
		
		if( dumbo3 < dumbo1){ 
			JOptionPane.showMessageDialog(null, "ERROR I'M GOING TO CALL THE POLICE COUNT YOUR MONEY NEXT TIME !! also there is a sale at Old Navey ");
			
		}else{
		JOptionPane.showMessageDialog(null,  dumboSuperior + " dollar(s) is your change");
		}
			
		}
	if(living == 3){
		String answer = JOptionPane.showInputDialog("Write a message");
		JOptionPane.showMessageDialog(null, answer);
		}
			if(living == 4){ 
				JOptionPane.showMessageDialog(null, "You put this on yourself wow ");
			System.exit(0);
			}
		
		
	}
	
	
	
	
	
	
	
	}
	
	
	
