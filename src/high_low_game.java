 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Technical Schools 2013
public class high_low_game {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int Pigs = new Random().nextInt(100)+1;
		// 2. Print out the random variable above
		System.out.println(Pigs);
		// 11. do the following 10 times
		int Sheep = 0;
		int Wins = 0;
		
		for (int i = 0; i < 10; i++) {	
String Cows = JOptionPane.showInputDialog("Guess a numba betwen 1 and 100 (use a number)");
		

			
			// 5. if the guess is correct


	int Ducks = Integer.parseInt(Cows);
		
		
if(Pigs == Ducks){
	JOptionPane.showMessageDialog(null, "You won a HHHHUNDRED dolors");
		Wins =+ 1;
	String YN = JOptionPane.showInputDialog("Do you want to buy an extra life for five hundred (Yes/No all Caps)");
	if(YN == "YES" && Wins == 5){
		JOptionPane.showMessageDialog(null, "new life");
		Sheep =- 1;
		Wins =- 5;
		
	}else{
		JOptionPane.showMessageDialog(null, "ok come back later");

	}
	}
	

				// 6. win
			// 7. if the guess is high

if(Ducks > Pigs){
	JOptionPane.showMessageDialog(null, "Too High");
	Sheep =+ 1;
}
				// 8. tell them it's too high
if(Ducks < Pigs){
JOptionPane.showMessageDialog(null, "Too Low");	
	Sheep =+ 1;
}
			// 9. if the guess is low
				// 10. tell them it's too low
if(Sheep == 5){
	JOptionPane.showMessageDialog(null, "You lose (Why you wast yo time playing this game whaen you could have jumped that cliff two mins ago anywhey)");
}
}

		// 12. tell them they lose
	}

}


