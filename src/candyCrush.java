//Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;


public class candyCrush {


	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
String h =JOptionPane.showInputDialog("Who do not like");

		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on "+h +"!");
		// 3. Ask the user for the name of their best friend
	String j =	JOptionPane.showInputDialog("Who is your best friend");
	JOptionPane.showMessageDialog(null, j +" is as sweet as candy.");
		// 4. Tell them their best friend is as sweet as candy


	} 
}






