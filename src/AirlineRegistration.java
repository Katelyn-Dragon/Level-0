// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	public static void main(String[] args) {
		
	
	String name = JOptionPane.showInputDialog("Thank you for choosing MTT airlines, for security reasons we want to know your first name.");
String Lastname = JOptionPane.showInputDialog("We will also need to know your last name.");
String destination = JOptionPane.showInputDialog("What is your destination? I'm sure you won't get mugged.");
String DOB = JOptionPane.showInputDialog("We need your need your Birthdate too.");
String gender = JOptionPane.showInputDialog("Are you Male, Female,Transgender, or Tyler Oakley?");
JOptionPane.showInputDialog("Alright so if I am correct, your first name is " + name+ "\n Your last name " + Lastname+ "\n destination is " +destination+ "\n and your Birthdate is " + DOB);
JOptionPane.showMessageDialog(null, "I am the hacker known as 4chan you idiot! I WILL RULE THE WORLD WITH YOUR CREDIT CARD! HUEHUEHUEHUEHUE!");

	}
}
/**Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plan) and print out the number of passengers after each boarding pass.
*/
