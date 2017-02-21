import javax.lang.model.util.ElementScanner6;
import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		
		speak("spell mandlebrot");
		String answer = JOptionPane.showInputDialog("Spell what the voice said");
		if (answer.equals("mandlebrot")) {
			speak("correct");
		}
		
		else {
			speak("wrong");
		}
		
		speak("spell hippopotomonstrosesquippedaliophobia");
		String hippo = JOptionPane.showInputDialog("Spell what the voice said");
		if (hippo.equals("hippopotomonstrosesquippedaliophobia")) {
			speak("correct");
		}
		
		else {
			speak("wrong");
		}
		speak("spell antidisestablishmentarianism");
		String word = JOptionPane.showInputDialog("Spell what the voice said");
		if (word.equals("antidisestablishmentarianism")) {
			speak("correct");
		}
		
		else {
			speak("wrong");
		}
		speak("spell pneumonoultramicroscopicsilicovolcanoconiosis");
		String words = JOptionPane.showInputDialog("Spell what the voice said");
		if (words.equals("pneumonoultramicroscopicsilicovolcanoconiosis")) {
			speak("correct");
		}
		
		else {
			speak("wrong");
		}
		speak("spell Honorificabilitudinitatibus");
		String worded = JOptionPane.showInputDialog("Spell what the voice said");
		if (worded.equals("Honorificabilitudinitatibus")) {
			speak("correct");
		}
		
		else {
			speak("wrong");
		}
		speak("spell  Llanfairpwllgwyngyllgogerychwyrndrobwyll-llantysiliogog");
		String an = JOptionPane.showInputDialog("Spell what the voice said");
		if (an.equals(" Llanfairpwllgwyngyllgogerychwyrndrobwyll-llantysiliogog")) {
			speak("correct");
		}
		
		else {
			speak("wrong");
		}
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}