import javax.swing.JOptionPane;

public class Coversation {
public static void main(String[] args) {
    JOptionPane.showInputDialog("Why are you here?");
	JOptionPane.showInputDialog("seriously?");
    JOptionPane.showInputDialog("This is boring, now go outside and stop talking to a computer. :D"); 
  String computer = JOptionPane.showInputDialog("Why are you still here?!");
    JOptionPane.showMessageDialog(null, "Don't you " + computer+ " me!");
}
}