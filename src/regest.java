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
public class regest {
	public static void main(String[] args) {
		int p = 0;
for (int i = 0; i < 10; i++) {
	
if (p < 10){

String fn =		JOptionPane.showInputDialog("First name");
String ln =		JOptionPane.showInputDialog("Last name");
String da =		JOptionPane.showInputDialog("Destination airport");
String bd =		JOptionPane.showInputDialog("Date of birth (for security purposes)");
String g  =		JOptionPane.showInputDialog("Gender (Male/female/other) (for security purposes)");

JOptionPane.showMessageDialog(null, "First name " + fn +"\nLast name " + ln + "\nDestination airport " + da + "\nDate of birth " + bd + "\nGender " + g);
p = p + 1;
JOptionPane.showMessageDialog(null, "Passengers: " + p);
}else{
	for (int j = 0; j <10; j++) {
JOptionPane.showMessageDialog(null, "10 Person flight plan has met restrictions related to hamburgers hot dogs and duck flavord pasta");	
JOptionPane.showMessageDialog(null, "10 Person flight plan has met restrictions related to hamburgers hot dogs and duck flavord pasta");	
JOptionPane.showMessageDialog(null, "10 Person flight plan has met restrictions related to hamburgers hot dogs and duck flavord pasta");	
JOptionPane.showMessageDialog(null, "10 Person flight plan has met restrictions related to hamburgers hot dogs and duck flavord pasta");	
JOptionPane.showMessageDialog(null, "10 Person flight plan has met restrictions related to hamburgers hot dogs and duck flavord pasta");	
	}
}
}
	}
}



/**Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plan) and print out the number of passengers after each boarding pass.
*/
