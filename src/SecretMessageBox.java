
// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your
 * friend can read it. You set up the passcode and the secret message. Your
 * friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		// 1. Set the passcode in a String variable
		String password ="Dragon";
		// 2. Using a pop-up, ask for a secret message and store it in a
		// variable
		String answer = JOptionPane.showInputDialog("Put in the password");
		// 3. Ask your friend for the passcode and store it in a variable
		
		// 4. If the passcode matches, show the secret message
		if (password.equals(answer)) {
			JOptionPane.showMessageDialog(null, "Secret Message:Why are you even here? Did you seriously waste your time on this just for a useless message? Shame...");
		}
		// 5. If the passcode does not match, pop-up "INTRUDER!!"
		else {
			JOptionPane.showMessageDialog(null,"You low-life dirty piece of scum, how dare you!I apologize for your existence...");
		}
	}
	// [optional] 6. Have your friend also enter a username, and make sure it is
	// correct before releasing the secret message.

}