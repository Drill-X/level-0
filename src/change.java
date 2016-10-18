
// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class change {

	public static void main(String[] args) {
boolean g;
		// Ask the user how many nickels they have
 String q = JOptionPane.showInputDialog("How maney dimes do you have (use a number pleas ;)");
  int w = Integer.parseInt(q);	
  int a = w*10;
  String e = JOptionPane.showInputDialog("How maney nickles do you have (use a number pleas ;)");
  int r = Integer.parseInt(e);	
  int s = r*5;
  String t = JOptionPane.showInputDialog("How maney quarters do you have (use a number pleas ;)");
  int y = Integer.parseInt(t);	
  int d = y*25;
  String u = JOptionPane.showInputDialog("How maney dolors do you have (use a number pleas ;)");
  int i = Integer.parseInt(u);	
  int f = i*100;
  
  double z = a + s + d + f;
  z = z/100;
  JOptionPane.showMessageDialog(null ,String.format( "You have $%2.2f" , z));
  int pizza =  JOptionPane.showConfirmDialog(null, "Do you want a sandwich", "",
			 JOptionPane.YES_NO_OPTION);
  if(pizza == 1){
	  g = true;
  }
  //if(g == true){
  //JOptionPane.showMessageDialog(null, "Heres your sandwich. It costs "+ z);
  //JOptionPane.showMessageDialog(null, "You now have $0.00 >:)");
 // }// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have

	}
}

